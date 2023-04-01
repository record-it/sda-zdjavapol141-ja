package pl.sda.pol141.day4.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Utwórz dowolny ExecutorService
 * Zleć wykonanie zadania obliczenia fib(45) i wyświetlenia wyniku
 */
public class ThreadTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final Thread[] task = new Thread[1];
        service.execute(new Runnable() {
            @Override
            public void run() {
                task[0] = Thread.currentThread();
                System.out.println(fib(45));
            }
        });
        Thread.sleep(1000);
        task[0].interrupt();
        System.out.println("czekamy na zadanie typu execute...");
        var result = service.submit(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return fib(45);
            }
        });
        System.out.println("czekamy na zadanie typu submit...");
        while (!result.isDone()) {
            //System.out.println("Czekamy ...");
        }
        System.out.println(result.get());
    }

    public static long fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        if (!Thread.currentThread().isInterrupted()) {
            return fib(n - 2) + fib(n - 1);
        } else {
            //return 0; // faszywy wynik po interrupt
            throw new RuntimeException("Zatrzymanie obliczania: interrupt");
        }
    }
}

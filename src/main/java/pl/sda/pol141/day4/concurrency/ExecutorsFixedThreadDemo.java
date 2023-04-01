package pl.sda.pol141.day4.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsFixedThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
    }
}

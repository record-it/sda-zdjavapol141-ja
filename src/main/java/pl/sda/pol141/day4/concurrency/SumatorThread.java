package pl.sda.pol141.day4.concurrency;

public class SumatorThread extends Thread {
    @Override
    public void run() {
        long sum = 0;
        int counter = 0;
        for (int i = 0; i < 10_000 && !this.isInterrupted(); i++) {
            counter++;
            try {
                Thread.sleep(1);//wykonywanie operacji
                sum += i;
            } catch (InterruptedException e) {
                this.interrupt();//podtrzymanie sygnałi interrupt, jeśli dotarł on do sleep
            }
        }
        System.out.println(
        "Suma obliczona przez wątek po " + counter + " iteracjach, " + sum
        );
    }
}

package pl.sda.pol141.day4.concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicLong counter = new AtomicLong(0);
        Thread count1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    //counter[0]++;
                    counter.incrementAndGet();
                }
            }
        });
        Thread count2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    //counter[0]++;
                    counter.incrementAndGet();
                }
            }
        });
        count1.start();
        count2.start();
        count1.join();
        count2.join();
        System.out.println(counter.get());
    }
}

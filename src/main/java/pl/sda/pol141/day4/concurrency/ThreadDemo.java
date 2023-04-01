package pl.sda.pol141.day4.concurrency;

import java.util.Scanner;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        SumatorThread thread = new SumatorThread();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wpisz polecenie");
            String command = scanner.nextLine();
            switch (command) {
                case "start": {
                    System.out.println("START");
                    thread.start();
                }
                break;
                case "stop": {
                    System.out.println("STOP");
                    thread.interrupt();
                    return;
                }
            }
        }
    }
}

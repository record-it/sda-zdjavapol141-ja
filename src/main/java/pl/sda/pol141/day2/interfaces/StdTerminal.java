package pl.sda.pol141.day2.interfaces;

import java.util.Scanner;

public class StdTerminal implements Console{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}

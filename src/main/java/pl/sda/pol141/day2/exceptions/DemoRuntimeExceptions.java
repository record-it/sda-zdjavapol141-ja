package pl.sda.pol141.day2.exceptions;

import java.util.Scanner;

public class DemoRuntimeExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą:");
        final String s = scanner.nextLine();
        try {
            int i = Integer.parseInt(s);
            System.out.println(percent(0, i));
            int[] arr = new int[2];
            arr[i] = 5;
        } catch (NumberFormatException e){
            System.out.println("Niepoprawny łańcuch, wpisz liczbę całkowotą!");
        } catch (ArithmeticException e){
            System.out.println("Nie dziel przez 0!");
        } finally {
            System.out.println("Koniec programu");
        }

    }

    public static double percent(int a, int b){
        return 100.0 * a / b;
    }

    /**
     * Metoda będzie zgłaszać wyjątek dla b = 0
     * @param a
     * @param b
     * @return
     */
    public static int percentInt(int a, int b){
        return 100 * a / b;
    }
}

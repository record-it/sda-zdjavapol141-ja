package pl.sda.pol141.day5.functional;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierDemo {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Supplier<Double> input = () -> random.nextDouble();
        System.out.println(input.get());
        input = () -> {
            if (scanner.hasNextDouble()){
                return scanner.nextDouble();
            } else {
                throw new RuntimeException();
            }
        };
        System.out.println(input.get() * 100);

        Box<String> box = new Box<>(() -> {
            System.out.println("Wywołanie get");
            return new String[]{"A", "B", "C"};
        });
        System.out.println(box);
        ///
        System.out.println(Arrays.asList(box.getContent()));
    }
}

package pl.sda.pol141.day5.functional;

import java.util.function.Function;

public class FunctionalInterfecesDemo {
    public static void main(String[] args) {
        Function<Double, Double> power = a -> a * a;
        Function<String, Double> parseDouble = s -> Double.parseDouble(s);

    }
}

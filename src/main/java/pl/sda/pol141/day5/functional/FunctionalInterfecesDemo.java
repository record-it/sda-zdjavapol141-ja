package pl.sda.pol141.day5.functional;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class FunctionalInterfecesDemo {
    public static void main(String[] args) {
        Function<Double, Double> power = a -> a * a;
        Function<String, Double> parseDouble = s -> Double.parseDouble(s);
        // sekwencyjne parsowanie i potęgowanie
        final Double number = parseDouble.apply("1.23");
        System.out.println(power.apply(number));
        // złożenie funkcji - to samo co wyżej
        final Double powerResult = parseDouble.andThen(power).apply("1.23");
        System.out.println(powerResult);

        // po sparsowaniu i podniesieniu do potęgi
        // zwróć łańcuch z wynikiem z dwoma miejscami po przecinku
        Function<Double, String> formatter = l -> String.format("%.2f", l);
        final String output = parseDouble
                .andThen(power)
                .andThen(formatter)
                .apply("1.23");
        System.out.println(output);
        String str =
                parseDouble
                        .andThen(a -> a * a)
                        .andThen(l -> String.format("%.2f", l))
                        .apply("1.23");
        System.out.println(str);
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        //Zdefiniować funkcję powielająca łańcuch n razy
        "asad".repeat(5);
        BiFunction<String, Integer, String> stringOperation = (s, i) -> s.repeat(i);
        System.out.println(stringOperation.apply("123",3));
        stringOperation = (s, i) -> s + " " + i;
        System.out.println(stringOperation.apply("Wiek Karola", 23));
        DoubleFunction<Double> power1 = a -> a * a;
    }
}

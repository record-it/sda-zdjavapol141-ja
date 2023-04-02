package pl.sda.pol141.day5.functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello World");
        printer = s -> {
            try {
                Files.writeString(
                        Paths.get("c:\\data\\hello.txt"),
                        s,
                        StandardOpenOption.APPEND
                );
            } catch (IOException e) {
                System.out.println(e);
            }
        };
        printer.accept("Hello World!");
        List<String> names = List.of("Ewa", "Adam", "Karol");
        names.forEach(s -> System.out.println(s));
        List<Integer> numbers = List.of(1, 4, 3, 5, 6, 7, 3, 7, 2);
        // przy pomocy metody forEach wyświetl kwadrat każdej liczby
        numbers.forEach(i -> System.out.println(i * i));
    }

}

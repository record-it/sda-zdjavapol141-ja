package pl.sda.pol141.day5.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {
    static Random random = new Random();
    static List<String> names = List.of("Adam", "Ewa", "Karol", "Ania", "Robert", "Tomek", "Ola", "Ewelina");

    public static Stream<String> namesStream() {
        return Stream.generate(() -> names.get(random.nextInt(names.size())));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Adam", "Ewa", "Karol", "Ania");
        final Stream<String> s1 = names.stream();

        Set<String> set= Set.of("A", "B", "C", "A", "E");
        final Stream<String> s2 = set.stream();

        final Stream<String> s3 = Stream.of("A", "B", "X", "A", "G");

        final Stream<Integer> s4 = Stream.generate(() -> random.nextInt(100));

        final Stream<String> s5 = Stream.generate(() -> names.get(random.nextInt(names.size())));

        final Stream<Integer> s6 = Stream.iterate(0, n -> n + 2);

        final IntStream s7 = IntStream.range(0, 100);
    }


}

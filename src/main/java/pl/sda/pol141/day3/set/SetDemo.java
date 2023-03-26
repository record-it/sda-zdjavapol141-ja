package pl.sda.pol141.day3.set;

import pl.sda.pol141.day2.app.AddressBookItem;

import java.time.LocalDate;
import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Set<String> names = new HashSet<>(List.of("Ewa", "Adam", "Ewa", "Karol"));
        System.out.println(names);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000; ++i) {
            integers.add(random.nextInt(100));
        }
        // Wyświetl liczby bez powtórzeń z integers np. jeśli tam byłyby liczby 1, 2, 3, 2, 4, 1, 5 to
        // wynik: 1, 2, 3, 4, 5
        System.out.println(new HashSet<>(integers));
        Set<AddressBookItem> itemsSet = new HashSet<>();
        for (int i = 0; i < 1_000_000; ++i) {
            itemsSet.add(AddressBookItem.of(
                            Integer.toString(random.nextInt(100)),
                            Integer.toString(random.nextInt(100)),
                            LocalDate.of(
                                    random.nextInt(1990, 2010),
                                    1 + random.nextInt(12),
                                    1 + random.nextInt(28))
                    )
            );
        }
        System.out.println("Szukamy ....");
        var start = System.nanoTime();
        System.out.println(itemsSet.contains(AddressBookItem.of(
                "78",
                "45",
                LocalDate.of(2000, 10, 10
                ))));
        System.out.println(System.nanoTime() - start);
    }
}

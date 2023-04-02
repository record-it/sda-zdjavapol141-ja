package pl.sda.pol141.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Napisz program, który:
 * - wczyta plik us-500.csv
 * - wypisze na ekranie, które z imion występuje najczęściej
 * - ile osób mieszka w każdym z miast
 * - zapisze do pliku emails.txt wszystkie emaile
 * Podpowiedzi:
 * ścieżka do pliku to src/main/java/pl/sda/pol141/task/us-500.csv
 * Wykorzystaj klasę Files
 */
public class Task1 {
    static Path path = Paths.get("src/main/java/pl/sda/pol141/task/us-500.csv");
    public static void main(String[] args) throws IOException {
        final List<Person> people = Files.lines(path)
                .skip(1)
                .map(line -> {
                    final String[] tokens = line.split(",");
                    return new Person(tokens[0], tokens[1]);
                })
                .toList();
        final Stream<String> distinct = people.stream().map(p -> p.getFirstName()).distinct();
        Map<String, Integer> counters = new HashMap<>();
        distinct.forEach(name -> counters.put(name, 0));
        people.forEach(p -> counters.put(p.getFirstName(), counters.get(p.getFirstName()) + 1));
        System.out.println(counters);
    }

}

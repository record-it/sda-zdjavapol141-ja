package pl.sda.pol141.day5.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> endsWithA = s -> s.toUpperCase().endsWith("A");
        //endsWithA = s -> s.length() >= 3;
        List<String> names = List.of("Adam", "Ewa", "Karol", "Robert", "Ania");
        System.out.println(search(names, s -> s.length() == 4));
        // wyszukaj imiona zaczynające się literą A
        System.out.println(search(names, s -> s.toUpperCase().startsWith("A")));
        //wyszukaj imiona żeńskie 3-literowe
        Predicate<String> len3 = s -> s.length() == 3;
        System.out.println(search(names, s -> s.toUpperCase().endsWith("A") && s.length() == 3));

        System.out.println(search(names, endsWithA.and(s -> s.length() == 3)));


        System.out.println(search(names, endsWithA.negate()));
    }

    public static List<String> search(List<String> collection, Predicate<String> filter){
        List<String> results = new ArrayList<>();
        for(var item: collection){
            if (filter.test(item)){
                results.add(item);
            }
        }
        return results;
    }

}

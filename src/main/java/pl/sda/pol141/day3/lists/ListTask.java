package pl.sda.pol141.day3.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Utwórz listę imion
 * Dodaj kilka imion: Adam, Ewa, Karol
 * Wyświetl imiona od ostatniego do pierwszego
 * Usuń imię "Karol"
 * Zamień imię "Ewa" na "Ania", ale tak, jakbyś nie wiedział, gdzie jest "Ewa"
 */
public class ListTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Ewa");
        names.add("Karol");
        for(int i = names.size() - 1; i > -1; i--){
            System.out.println(names.get(i));
        }
        names.remove("Karol");
        final int index = names.indexOf("Ewa");
        if (index > -1){
            names.set(index, "Ania");
        }
        System.out.println(names);
    }
}

package pl.sda.pol141.day3.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Utwórz listę imion
 * Dodaj kilka imion: Adam, Ewa, Karol
 * Wyświetl imiona od ostatniego do pierwszego
 * Usuń imię "Karol"
 * Zamień imię "Ewa" na "Ania", ale tak, jakbyś nie wiedział, gdzie jest "Ewa"
 * Działanie ArrayList
 * {"Adam","Ewa","Karol"}null   null    null
 * [0]    [1]    [2]    [3]     [4]     [5]
 * {"Adam","Ania", "Ewa", "Karol" } null null
 * [0]    [1]   -> [2] ->  [3] -> [4]   [5]
 */
public class ListTask {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
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
        names.addAll(1, List.of("Ola", "Robert"));
        System.out.println(names);
        // subList tworzy widok listy
        final List<String> subList = names.subList(0, 2);
        System.out.println(subList);
        // dodanie elementu do widoku modyfikuje listę names!
        subList.add("Edward");
        // utworzenie kopii podlisty, kopia nie jest powiązana z listą names
        List<String> copyOfSubList = new ArrayList<>(subList);
        copyOfSubList.add("Karolina");
        System.out.println(names);
        System.out.println(copyOfSubList);
    }
}

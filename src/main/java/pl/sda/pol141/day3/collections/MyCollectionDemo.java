package pl.sda.pol141.day3.collections;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        integers.add(8);
        integers.add(2);
        integers.add(6);
        integers.add(7);
        System.out.println("Rozmiar początkowy");
        System.out.println(integers.size());
        integers.remove(6);
        System.out.println("Rozmiar po usunięciu 6");
        System.out.println(integers.size());
        integers.remove(7);
        System.out.println("Rozmiar po usunięciu 7");
        System.out.println(integers.size());
        System.out.println("Iteracja po kolekcji");
        for(var item: integers){
            System.out.println(item);
        }
        System.out.println("Czy kolekcja zawiera 8");
        System.out.println(integers.contains(8));
        System.out.println("Czy kolekcja zawiera 7");
        System.out.println(integers.contains(7));
    }
}

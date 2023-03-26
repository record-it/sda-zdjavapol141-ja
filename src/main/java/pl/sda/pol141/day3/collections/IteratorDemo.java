package pl.sda.pol141.day3.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Ewa");
        names.add("Karol");
        System.out.println("Iterowanie po kolekcji z użyciem iteratora");
        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){                  //
            final String item = iterator.next();    //
            System.out.println(item);
        }
        //alternatywna postać pętli z iteratorem
        for(var it = names.iterator(); it.hasNext();){
            final String item = it.next();
            System.out.println(item);
        }
        System.out.println("Iterowanie po kolekcji z użyciem pętli foreach");
        // wykorzytujemy pętle foreach zamiast iteratora
        for(String item: names){
            System.out.println(item);
        }

    }
}

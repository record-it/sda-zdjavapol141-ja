package pl.sda.pol141.day3.lists;

import pl.sda.pol141.day2.app.AddressBookItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<AddressBookItem> items = new ArrayList<>(100);
        items.add(0, AddressBookItem.of("1","1", LocalDate.now()));
        items.add(0, AddressBookItem.of("2","2", LocalDate.now()));
        items.add(0, AddressBookItem.of("3","3", LocalDate.now()));
        items.set(2, AddressBookItem.of("4","4",LocalDate.now()));
        for(var item: items){
            System.out.println(item);
        }
        if (!items.isEmpty()) {
            System.out.println("Pierwszy element listy");
            System.out.println(items.get(0));
            System.out.println("Ostatni element listy");
            System.out.println(items.get(items.size() - 1));
        }
        final AddressBookItem removed = items.remove(2);
        var item = items.get(0);
        System.out.println(items);
        System.out.println(items.indexOf(removed));
        System.out.println(items.indexOf(item));
    }
}

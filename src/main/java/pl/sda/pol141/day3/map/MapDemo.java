package pl.sda.pol141.day3.map;

import pl.sda.pol141.day2.app.AddressBookItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, AddressBookItem> phoneBook = new HashMap<>();
        AddressBookItem item = AddressBookItem.of("1@op.pl", "1111", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        item = AddressBookItem.of("3@op.pl", "3333", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        item = AddressBookItem.of("2@op.pl", "2222", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        phoneBook.putIfAbsent("2222", AddressBookItem.of("1","1", LocalDate.now()));

        final AddressBookItem bookItem = phoneBook.get("2222");
        if (bookItem == null){
            System.out.println("Brak takiego wpisu");
        } else {
            System.out.println("Wyszukana osoba o numerze " + bookItem.getPhone());
            System.out.println(bookItem);
        }
        final Set<String> phoneNumbers = phoneBook.keySet();
        System.out.println(phoneNumbers);
        final Collection<AddressBookItem> items = phoneBook.values();
        System.out.println(items);
        for(var entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        var s = phoneBook.getOrDefault("1111", AddressBookItem.of("empty", "empty", LocalDate.EPOCH));
        System.out.println(s);
    }
}

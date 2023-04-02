package pl.sda.pol141.day4.io;

import pl.sda.pol141.day2.app.AddressBookItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ImportPhoneBook {

    public static final String DELIMITER = "\\|";

    public static void main(String[] args) {
        Path pathToBook = Paths.get("c:\\data\\phone-book.txt");
        List<AddressBookItem> items = new ArrayList<>();
        try {
            List<String> bookList = Files.readAllLines(pathToBook);
            for(var line: bookList){
                //System.out.println(line);
                final String[] tokens = line.split(DELIMITER);
                if (tokens.length != 3){
                    continue;
                }
                try {
                    AddressBookItem item = AddressBookItem.of(tokens[0], tokens[1], LocalDate.parse(tokens[2]));
                    items.add(item);
                } catch (IllegalArgumentException e){
                    System.out.println("Ten wiersz nie zawiera poprawnej daty!");
                }
            }
        } catch (IOException e) {
            System.out.println("Nie można wczytać pliku: " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dzień urodzin szukanych osób:");
        int day = scanner.nextInt();
        List<AddressBookItem> found = new ArrayList<>();
        for(var item: items){
            if (item.getBirth().getDayOfMonth() == day){
                found.add(item);
            }
        }
        System.out.println("Lista osób urodzonych w dniu: " + day);
        for(var item: found){
            System.out.println(item);
        }
        //poszukaj osoby o podanym numerze telefonu
        System.out.println("Podaj nr telefonu");
        String phone = scanner.nextLine();
        items.stream()
                .filter(item -> item.getPhone().equals(phone))
                .forEach(item -> System.out.println(item));
    }
}

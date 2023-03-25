package pl.sda.pol141.day2.app;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AddressBookApp {
    private static AddressBookItem[] items = new AddressBookItem[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int index = 0;
    public static void main(String[] args) {
        inputAddressBookItem();
        for (var item: items) {
            if (item != null){
                System.out.println(item);
            }
        }
    }

    private static void inputAddressBookItem() {
        System.out.println("Wpisz adres email");
        String email = scanner.nextLine();
        System.out.println("Wpisz nr telefonu");
        String phone = scanner.nextLine();
        boolean isDateValid = false;
        while (!isDateValid) {
            System.out.println("Wpisz datę urodzin wg wzoru: YYYY-MM-DD np. 2000-10-26");
            String birthAsString = scanner.nextLine();
            try {
                final AddressBookItem item = AddressBookItem.of(email, phone, LocalDate.parse(birthAsString));
                items[index++] = item;
                isDateValid = true;
            } catch (DateTimeParseException e) {
                System.out.println("Data urodzin niezgodna z formatem! Spróbuj jeszcze raz");
            }
        }
    }
}

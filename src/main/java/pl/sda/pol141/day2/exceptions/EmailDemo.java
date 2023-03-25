package pl.sda.pol141.day2.exceptions;

public class EmailDemo {
    public static void main(String[] args) {
        Email email = Email.of(null, "", null, null);
        System.out.println(email);
    }
}

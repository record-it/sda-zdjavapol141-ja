package pl.sda.pol141.day2.enums;

/**
 * Zdefiniuj typ wyliczeniowy Languages z wartościami:
 * POLISH,
 * ENGLISH,
 * FRENCH
 */
public class Demo {
    public static void main(String[] args) {
        String weekday = "Poniedziałek";
        String birthDay1 = "poniedzałek";

        Weekday day = Weekday.MONDAY;

        Weekday birthDay = day;
        System.out.println(day);

    }
}

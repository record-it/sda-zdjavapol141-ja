package pl.sda.pol141.day3.generic;

import pl.sda.pol141.day1.aggregation.Person;

public class BoxDemo {
    public static void main(String[] args) {
        // Box typu generycznego - miejsce T wstawiany jest konkretny typ z <T>
        Box<String> letter = new Box<>("adres1", "adres2", "Hello");
        Box<Integer> intBox = new Box<>("nr konta 1", "nr konta 2", 1000);
        Box[] items = new Box[5];
        items[0] = letter;
        items[1] = intBox;
        // Box typu surowego - w miejsce T jest wstawiana klasa Object
        Box objBox = new Box("a1", "a2", new Person());
        Box<String>[] letters = new Box[5];
        letters[0] = letter;
        System.out.println(letter.getContent());
        System.out.println(intBox.getContent());
        // Zadeklaruj  musicianBox tylko na obiekty klasy Musician
        Box<? extends Musician> musicianBox = new Box<>(
                "", "", new GuitarPlayer()
        );


    }
}

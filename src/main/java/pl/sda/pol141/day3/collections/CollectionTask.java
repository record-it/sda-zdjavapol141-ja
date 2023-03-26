package pl.sda.pol141.day3.collections;

import pl.sda.pol141.day3.generic.Drummer;
import pl.sda.pol141.day3.generic.GuitarPlayer;
import pl.sda.pol141.day3.generic.Musician;

import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Utwórz kolekcę muzyków klasy GuitarPlayer
 * Dodaj do kolekcji dwóch muzyków
 * Wywołaj dla każdego muzyka z kolekcji metodę play
 * Wyświetl liczbę muzyków
 */
public class CollectionTask {
    public static void main(String[] args) {
        Collection<GuitarPlayer> guitarPlayers = new ArrayList<>();
        guitarPlayers.add(new GuitarPlayer());
        guitarPlayers.add(new GuitarPlayer());
        for(var player:guitarPlayers){
            player.play();
        }
        System.out.println(guitarPlayers.size());
        Collection<Musician> musicians = new ArrayList<>();
        musicians.add(new GuitarPlayer());
        musicians.add(new Musician());
        musicians.add(new Drummer());
        musicians.add(new Musician());
        // policzyć ilu jest gitarzystów w kolekcji - obiektów klasy GuitarPlayer
        int guitarPlayerCounter = 0;
        for(var player: musicians){
            if (player instanceof Drummer){
                guitarPlayerCounter++;
            }
        }
        Collection<Drummer> drummers = new ArrayList<>();
        drummers.add(new Drummer());
        Collection<Musician> band = new ArrayList<>();
        band.addAll(guitarPlayers);
        band.addAll(drummers);
        band.addAll(musicians);
        System.out.println("Liczba perkusistów: " + countInstanceOf(Musician.class, musicians));
    }

    public static <T> int countInstanceOf(Class<T> clazz, Collection<?> collection){
        int counter = 0;
        for(var player: collection){
            if (clazz.isInstance(player)){
                counter++;
            }
        }
        return counter;
    }
}

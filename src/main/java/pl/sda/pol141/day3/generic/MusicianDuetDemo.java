package pl.sda.pol141.day3.generic;

public class MusicianDuetDemo {
    public static void main(String[] args) {
        MusicianDuet<Musician, Musician> duet = new MusicianDuet<>(
                new Musician(),
                new Musician()
        );

        // w konstruktorze trzeba podać tylko typy GuitarPlayer
        MusicianDuet<GuitarPlayer, GuitarPlayer> guitarDuet = new MusicianDuet<>(
                new GuitarPlayer(),
                new GuitarPlayer()
        );

        duet.play();
        guitarDuet.play();

        // w konstruktorze można wstawić dowolny typ muzyka
        MusicianDuet<?,?> unknownDuet = new MusicianDuet<>(
            new Drummer(),
            new GuitarPlayer()
        );
        unknownDuet.play();



    }
}

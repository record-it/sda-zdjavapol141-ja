package pl.sda.pol141.day3.generic;

public class MusicianBand<T extends Musician> {
    private T[] musicians;

    public MusicianBand(T[] musicians) {
        this.musicians = musicians;
    }
}

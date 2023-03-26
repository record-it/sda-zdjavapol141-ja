package pl.sda.pol141.day3.generic;
// Ograniczenie extends powoduje, że T i V muszą dziedziczyć po klasie Musician
public class MusicianDuet<T extends Musician, V extends Musician> {
    private T musicianFirst;
    private V musicianSecond;

    public MusicianDuet(T musicianFirst, V musicianSecond) {
        this.musicianFirst = musicianFirst;
        this.musicianSecond = musicianSecond;
    }

    public T getMusicianFirst() {
        return musicianFirst;
    }

    public V getMusicianSecond() {
        return musicianSecond;
    }

    public void play(){
        musicianFirst.play();
        musicianSecond.play();
    }
}

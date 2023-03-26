package pl.sda.pol141.day3.generic;

public class Box<T> {
    private String addressFrom;
    private String addressTo;
    private T content;

    // konstruktor z parametrem generycznym - content
    public Box(String addressFrom, String addressTo, T content) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.content = content;
    }

    // metoda generyczna zwracająca typ ogólny
    public T getContent(){
        return content;
    }
}

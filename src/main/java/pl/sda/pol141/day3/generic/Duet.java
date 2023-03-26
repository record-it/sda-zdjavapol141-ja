package pl.sda.pol141.day3.generic;

public class Duet<T,K> {
    private T first;
    private K second;

    public Duet(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public boolean isValid(){
        //zaimplementuj metodę, która zwróci true jeśli oba pola nie są null
        return first != null && second != null;
    }
}

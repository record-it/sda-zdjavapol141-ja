package pl.sda.pol141.day3.generic;

public class DuetDemo {
    public static void main(String[] args) {
        Duet<String, Integer> duet1 = new Duet<>("A", 10);
        Duet<Boolean, Double> duet2 = new Duet<>(true, 10.1);
        System.out.println(duet1.getFirst());
        System.out.println(duet2.getFirst());
        System.out.println(duet1.getSecond());
        System.out.println(duet2.getSecond());
    }
}

package pl.sda.pol141.day1.aggregation;

public class Demo {
    public static void main(String[] args) {
        Person mother = new Person();
        HumanBody body = new HumanBody(mother);
    }
}

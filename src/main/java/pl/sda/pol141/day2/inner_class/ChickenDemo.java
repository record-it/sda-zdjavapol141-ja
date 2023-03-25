package pl.sda.pol141.day2.inner_class;

public class ChickenDemo {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        var egg1 = chicken.new ChickenEgg();
        var egg2 = chicken.new ChickenEgg();
        System.out.println(chicken.getEggCounter());
    }
}

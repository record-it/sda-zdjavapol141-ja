package pl.sda.pol141.day2.inner_class;

public class Chicken {
    private int eggCounter;

    public class ChickenEgg{
        public ChickenEgg() {
            eggCounter++;
        }
    }
    public int getEggCounter() {
        return eggCounter;
    }
}

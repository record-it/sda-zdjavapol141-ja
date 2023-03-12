package pl.sda.pol141.day1.hermetization;

final public class Battery {        //klasa nie może być dziedziczona
    public static final int CONSUMPTION_FACTOR = 20;
    private final double capacity;  //stała, może też być publiczna

    private double level;       //zmienny stan klasy musi być prywatny

    public Battery(double capacity) {
        this.capacity = capacity;
        this.level = 0;
    }

    public boolean drive(double distance){
        double consumption = distance * CONSUMPTION_FACTOR;
        if (level >= consumption) {
            level -= consumption;
            return true;
        } else {
            return false;
        }
    }

    public double getLevel() {
        return level;
    }

    public void recharge(){
        level = capacity;
    }

    public boolean isEmpty(){
        return level == 0;
    }

    public double getCapacity() {
        return capacity;
    }
}

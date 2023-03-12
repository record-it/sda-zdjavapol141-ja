package pl.sda.pol141.day1.abstractions;


/**
 * Zdefiniuj klasę dziedziczącą po Vehicle z abstractions
 */
public class Bicycle extends Vehicle {
    public final int gears;

    public Bicycle(int gears) {
        this.gears = gears;
    }

    @Override
    public void drive(int distance) {
        System.out.println("bicycle drive " + distance);
        mileage += distance;
    }
}

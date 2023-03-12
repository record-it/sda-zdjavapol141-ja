package pl.sda.pol141.day1.abstractions;

public class Truck extends Car{
    private double loading;

    @Override
    public void drive(int distance) {
        System.out.println("Driving distance " + distance);
        mileage += distance;
    }
}

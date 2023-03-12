package pl.sda.pol141.day1.abstractions;
import pl.sda.pol141.day1.inheritance.Scooter;

public class Main {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("afsdf", 12);
        Vehicle vehicle = new Truck();
        vehicle.drive(10);
        System.out.println(vehicle.mileage);
    }
}

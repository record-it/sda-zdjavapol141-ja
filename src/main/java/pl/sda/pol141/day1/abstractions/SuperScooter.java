package pl.sda.pol141.day1.abstractions;

import pl.sda.pol141.day1.inheritance.Scooter;

public class SuperScooter extends Scooter {
    public SuperScooter(String serialNumber, double weight) {
        super(serialNumber, weight);
        this.mileage = 10;
    }
}

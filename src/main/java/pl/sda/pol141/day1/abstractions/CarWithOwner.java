package pl.sda.pol141.day1.abstractions;

import pl.sda.pol141.day1.aggregation.Person;

public class CarWithOwner extends Car{

    private final Person owner;

    public CarWithOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public void drive(int distance) {

    }
}

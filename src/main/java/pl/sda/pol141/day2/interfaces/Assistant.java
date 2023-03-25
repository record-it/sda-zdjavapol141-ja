package pl.sda.pol141.day2.interfaces;

import pl.sda.pol141.day1.aggregation.Person;

import java.io.Serializable;

public class Assistant extends Person implements Translator, Serializable {
    @Override
    public String sayHello() {
        return "Ahoj";
    }

    @Override
    public String sayGoodBay() {
        return "Uvidíme se";
    }
}

package pl.sda.pol141.day1.value_object;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Power power = new Power(10);
        System.out.println(power);
        Power doublePower = power.mulByScalar(2);
        System.out.println(doublePower);
        System.out.println(power.addPower(doublePower));

    }
}

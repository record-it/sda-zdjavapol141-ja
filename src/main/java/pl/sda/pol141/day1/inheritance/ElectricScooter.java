package pl.sda.pol141.day1.inheritance;

public class ElectricScooter extends Scooter{
    public final double power;

    public ElectricScooter(String serialNumber, double weight, double power) {
        super(serialNumber, weight);
        this.power = power;
        this.mileage = 0;
    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "power=" + power +
                ", serialNumber='" + serialNumber + '\'' +
                ", weight=" + weight +
                "} ";
    }

}

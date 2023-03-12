package pl.sda.pol141.day1.inheritance;

public class Scooter{
    public final String serialNumber;

    public final double weight;

    protected int mileage;

    public Scooter(String serialNumber, double weight) {
        this.serialNumber = serialNumber;
        this.weight = weight;
    }

    public int getMileage() {
        return mileage;
    }

    public void printSerial(){
        System.out.println("Serial number: " + serialNumber);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "serialNumber='" + serialNumber + '\'' +
                ", weight=" + weight +
                '}';
    }
}

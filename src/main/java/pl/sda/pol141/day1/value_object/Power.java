package pl.sda.pol141.day1.value_object;

public class Power {
    public final double value;
    public final String unit;

    public Power(double value) {
        this.value = value;
        this.unit = "W";
    }

    private Power(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    public static Power ofKW(double value){
        //return new Power(value * 1000);
        return new Power(value, "kW");
    }

    public Power mulByScalar(double f){
        return new Power(value * f);
    }

    public Power addPower(Power add){
        if (unit.equals(add.unit)){
            return new Power(add.value + value);
        }
        if (unit.equals("W") && add.unit.equals("kW")){
            return new Power(value + add.value * 1000);
        }
        //dopisać warunek gdy obiekt ma moc w kW a `add` w W
        return null;    //na razie zwracamy null, później zgłosimy wyjątek
    }

    @Override
    public String toString() {
        return "Power {" + value + " " + unit + '}';
    }
}

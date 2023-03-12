package pl.sda.pol141.day1.value_object;

public class Power {
    public static final String POWER_UNIT_W = "W";
    public static final String POWER_UNIT_KW = "kW";
    public final double value;
    public final String unit;

    public Power(double value) {
        this.value = value;
        this.unit = POWER_UNIT_W;
    }

    private Power(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    public static Power ofKW(double value){
        return new Power(value, POWER_UNIT_KW);
    }

    public Power mulByScalar(double f){
        return new Power(value * f);
    }

    public Power addPower(Power add){
        if (unit.equals(add.unit)){
            return new Power(add.value + value, unit);
        }
        if (unit.equals(POWER_UNIT_W) && add.unit.equals(POWER_UNIT_KW)){
            return new Power(value + add.value * 1000, unit);
        }
        if (unit.equals(POWER_UNIT_KW) && add.unit.equals(POWER_UNIT_W)){
            return new Power(value + add.value / 1000, unit);
        }
        //dopisać warunek, gdy obiekt ma moc w `kW` `a `add` w `W`
        return null;    //na razie zwracamy null, później zgłosimy wyjątek
    }

    @Override
    public String toString() {
        return "Power {" + value + " " + unit + '}';
    }
}

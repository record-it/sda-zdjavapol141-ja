package pl.sda.pol141.day1.hermetization;

class MyString{
    public int length(){
        return 5;
    }
}
class NewString extends MyString{
    @Override
    public int length() {
        return 0;
    }
}
public class Demo {
    public static void main(String[] args) {
        Battery battery = new Battery(1000);
        battery.recharge();
        MyString s = getString();
        System.out.println(s.length());
        System.out.println(battery.getLevel());
        System.out.println("Can drive? " + battery.drive(15));
        System.out.println(battery.getLevel());
        System.out.println("Can drive? " + battery.drive(55));
        System.out.println(battery.getLevel());
    }

    static public MyString getString(){
        return new NewString();
    }
}

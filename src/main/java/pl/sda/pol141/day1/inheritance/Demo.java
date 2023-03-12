package pl.sda.pol141.day1.inheritance;

public class Demo {
    public static void main(String[] args) {
        //utwórz obiekt klasy Scooter i ElectricScooter
        Scooter scooter = new Scooter("1234Ab", 10);            //klasa bazowa, rodzic, super klasa
        ElectricScooter electricScooter = new ElectricScooter("345", 9, 500); //klasa wyprowadzona, podklasa
        electricScooter.printSerial();
        scooter.printSerial();
        scooter.mileage = 10;

        Scooter[] store = new Scooter[10];
        store[0] = scooter;
        store[1] = electricScooter;

        ElectricScooter s = (ElectricScooter) store[1];
        System.out.println(s.power);

        Object object = new Object();
        System.out.println(object.toString());
        System.out.println(object.hashCode());
        System.out.println(object.equals(object));

        Object[] all = new Object[5];       //takich tablic nie nalezy deklarować!
        all[0] = 1;
        all[1] = true;
        all[2] = "ABC";
        all[3] = scooter;
        all[4] = electricScooter;
        //napisz petlę, w której wyświetl każda komórkę tablicy all
        int counter = 0;
        int stringCounter = 0;
        for(Object item: all){
            System.out.println(item.toString()); //wywolanie polimorficzne toString()
            if (item instanceof Scooter){
                counter++;
            }
            //policz ile jest łańcuchów
            if( item instanceof String){
                stringCounter++;
            }
        }
        System.out.println("Liczba hulajnóg: " + counter);
        System.out.println("Liczba łańuchów: " + stringCounter);
        System.out.println("wynik dodawania 2 + 3: " + 2 + 3);
        System.out.println("wynik dodawania 2 + 3: " + (2 + 3));
    }
}

package pl.sda.pol141.day2.interfaces;

import java.util.Random;

public class PolishTranslator implements Translator{
    private static String[] HELLO_MSG = {"Cześć", "Dzień dobry", "Jak się masz?"};
    //zrealizuj też losowanie komunikatów pożegania
    private static String[] GOOD_BAY_MSG = {"Do widzenia", "Narka", "Do zobaczenia?", "Żegnaj"};
    private static Random random = new Random();
    @Override
    public String sayHello() {
        return HELLO_MSG[random.nextInt(HELLO_MSG.length)];
    }

    @Override
    public String sayGoodBay() {
        return GOOD_BAY_MSG[random.nextInt(GOOD_BAY_MSG.length)];
    }
}

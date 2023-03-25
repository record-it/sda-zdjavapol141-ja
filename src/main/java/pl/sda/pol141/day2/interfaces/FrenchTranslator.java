package pl.sda.pol141.day2.interfaces;

public class FrenchTranslator implements Translator{
    @Override
    public String sayHello() {
        return "Salut";
    }

    @Override
    public String sayGoodBay() {
        return "À bientôt";
    }
}

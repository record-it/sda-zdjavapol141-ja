package pl.sda.pol141.day2.interfaces;
//Utwórz klasę EnglishTranslator implementującą Translator, która zwróci w sayHello
// komunikat "Hello"

//Utwórz klasę FrechTranslator i zaimplementuj ją komunikatami z jezyka francuskiego
//w programie Demo przypisz instancję tej klasy do zmiennej translator
public class Demo {
    public static void main(String[] args) {
        //Translator translator = new FrenchTranslator();
        Translator translator = new PolishTranslator();

        System.out.println(translator.sayHello());
        System.out.println(translator.sayGoodBay());

        Console console = new StdTerminal();

        console.print("Jak masz na imię");
        final String name = console.read();
        console.print(translator.sayHello() + " " + name);
        console.print(translator.sayGoodBay() + " " + name);

    }
}

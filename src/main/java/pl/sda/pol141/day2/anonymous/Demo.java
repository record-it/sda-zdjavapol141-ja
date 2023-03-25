package pl.sda.pol141.day2.anonymous;

import pl.sda.pol141.day2.interfaces.Console;
import pl.sda.pol141.day2.interfaces.Translator;

public class Demo {
    public static void main(String[] args) {
        Translator spanishTranslator = new Translator() {
            @Override
            public String sayHello() {
                return "Hola";
            }

            @Override
            public String sayGoodBay() {
                return "Hasta la vista";
            }
        };
        Console console = new Console() {
            private int counter;

            public int counter(){
                return counter;
            }
            @Override
            public void print(String message) {
                counter++;
                System.out.println(message);
            }

            @Override
            public String read() {
                return null;
            }
        };
        //Zadeklaruj klasę anonimową na podstawie interfejsu Console i przypisz do zmiennej console
        //i posługując się console wyświetl komunikaty ze spanishTranslator
//        System.out.println(spanishTranslator.sayHello());
//        System.out.println(spanishTranslator.sayGoodBay());
        console.print(spanishTranslator.sayHello());
        console.print(spanishTranslator.sayGoodBay());
    }
}

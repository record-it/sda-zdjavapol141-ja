package pl.sda.pol141.day2.enums;

import pl.sda.pol141.day1.aggregation.Person;
import pl.sda.pol141.day2.interfaces.*;

import java.util.Scanner;

public class LanguagesDemo1 {
    static Console console = new StdTerminal();
    public static void main(String[] args) {
        console.print("Wybierz swój język spośród poniższych?");
        for(var language: Languages.values()) {
            console.print(language.name());
        }
        String languageAsString = console.read();
        var language = Languages.valueOf(languageAsString.toUpperCase());
        Translator translator = new PolishTranslator();
        switch (language){
            case FRENCH:
                translator = new FrenchTranslator();
                break;
            case POLISH:
                translator = new PolishTranslator();
                break;
            case ENGLISH:
                translator = new Translator() {
                    @Override
                    public String sayHello() {
                        return "Hello";
                    }
                    @Override
                    public String sayGoodBay() {
                        return "Bye, bye";
                    }
                };
                break;
        }

        console.print(translator.sayHello());
        console.print(translator.sayGoodBay());
    }
}

package pl.sda.pol141.day2.enums;

import pl.sda.pol141.day2.interfaces.*;

public class LanguagesDemo2 {
    static Console console = new StdTerminal();

    public static void main(String[] args) {
        console.print("Wybierz swój język spośród poniższych?");
        for (var language : Languages.values()) {
            console.print(language.name());
        }
        String languageAsString = console.read();
        Languages language;
        try {
            language = Languages.valueOf(languageAsString.toUpperCase());
        } catch (IllegalArgumentException e){
            console.print("Wybrałeś nieobsługiwany język. Uruchom program ponownie");
            return;
        }
        console.print(language.ordinal()+"");
        Translator translator = language.getTranslator();
        console.print(translator.sayHello());
        console.print(translator.sayGoodBay());
    }
}

package pl.sda.pol141.day2.enums;

import pl.sda.pol141.day2.interfaces.FrenchTranslator;
import pl.sda.pol141.day2.interfaces.PolishTranslator;
import pl.sda.pol141.day2.interfaces.Translator;

public enum Languages {
    POLISH(new PolishTranslator()),  // public static final Languages POLISH = new Laguages(Translator trans)
    ENGLISH(new Translator() {
        @Override
        public String sayHello() {
            return "Hello";
        }

        @Override
        public String sayGoodBay() {
            return "Bye, bye";
        }
    }),
    FRENCH(new FrenchTranslator());

    private Translator translator;

    Languages(Translator translator) {
        this.translator = translator;
    }

    public Translator getTranslator() {
        return translator;
    }
}

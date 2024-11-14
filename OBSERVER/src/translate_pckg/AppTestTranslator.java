package translate_pckg;

import javax.naming.directory.InvalidAttributeIdentifierException;

public class AppTestTranslator {

    public static void main(String[] args) {
        Translator translator = new Translator();
        try {
            translator.setChoice(1);
            translator.translateThis("Ovo je za prijevod");
        } catch (InvalidAttributeIdentifierException e) {
            System.out.println(e.getMessage());
        }
    }
}

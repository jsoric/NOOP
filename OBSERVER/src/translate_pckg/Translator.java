package translate_pckg;

import javax.naming.directory.InvalidAttributeIdentifierException;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FranceTranslator franceTranslator;

    public Translator(){
        System.out.println("CRO to ENG and CRO to FRA translator");
        englishTranslator = new EnglishTranslator();
        franceTranslator = new FranceTranslator();
    }

    public void translate(String text){

    }

    public void setChoice(int number){
        this.choice = number;
    }

    public void translateThis(String text) throws InvalidAttributeIdentifierException {

        switch (choice){
            case 1: {
                englishTranslator.translateText(text);
            } break;
            case 2: {
                franceTranslator.translate(text);
            } break;

            default: throw new InvalidAttributeIdentifierException("Expected 1 or 2");
        }
    }
}

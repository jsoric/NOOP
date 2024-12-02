package translate_pckg;

import javax.management.InvalidAttributeValueException;

public class Translator {

    private int choice;
    private final EnglishTranslator englishTranslator;
    private final FranceTranslator franceTranslator;

    public Translator(){
        System.out.println("CRO to ENG and CRO to FRENCH translator...");
        englishTranslator = new EnglishTranslator();
        franceTranslator = new FranceTranslator();
    }

    public void setChoice(int number){
        this.choice = number;
    }

    public void translateThis(String text){

        switch (choice){
            case 1: {
                englishTranslator.translateText(text);
            }break;
            case 2: {
                franceTranslator.translate(text);
            }break;

            default: throw new IllegalArgumentException("Use option 1 or 2: ");
        }
    }
}

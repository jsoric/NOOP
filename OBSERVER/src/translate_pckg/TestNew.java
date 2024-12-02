package translate_pckg;

public class TestNew {

    public static void main(String[] args) {
        String text = "Ovo je neki tekst koji želimo prevesti na izabrani jezik...";
        TranslatorNew translatorNew = new TranslatorNew();
        translatorNew.setTranslate(new ENGTranslate());
        translatorNew.translateThisText(text);
        translatorNew.translateThisText(text);
    }
}
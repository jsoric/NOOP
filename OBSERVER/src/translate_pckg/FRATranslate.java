package translate_pckg;

public class FRATranslate implements Translate{
    @Override
    public void translate(String text) {
        System.out.println(getClass().getSimpleName() + " performing translation...");
        System.out.println("To translate this: \n" + text);
        System.out.println("Translated to FRA...");
    }
}

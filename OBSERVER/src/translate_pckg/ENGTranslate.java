package translate_pckg;

import static java.awt.SystemColor.text;

public class ENGTranslate implements Translate{
    @Override
    public void translate(String Text) {
        System.out.println(getClass().getSimpleName() + " performing translation...");
        System.out.println("To translate this: \n" + text);
    }
}

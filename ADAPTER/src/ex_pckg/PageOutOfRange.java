package ex_pckg;

public class PageOutOfRange extends Exception {

    private static final String MSG = "Page out of range";

    public PageOutOfRange(String msg){
        super(msg);

    }
}

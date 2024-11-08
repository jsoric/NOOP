package ex_pckg;

public interface ComicReader {

    //skok na stranicu
    void goToPage(int numPage) throws PageOutOfRange;
    //prelazak na sljedecu stranicu
    void next();
    //daje trenutnu stranicu
    int currentPage();
    //direktan prijelaz na prethodnu stranicu stripa
    void previous();
    //direktan prijelaz na posljednu stranicu stripa
    void last();
    //direktan prijelaz na prvu stranicu stripa
    void first();
    //omogucuje zoom in i zoom out u min i max granicama
    void zoom(int percent);
    //ukljucuje/iskljucuje mod za nocno citanje
    void nightReadingMode(boolean status);

    void changeBrightness(int value);
}

package ex_pckg;

public interface BookReader {

    void viewPage(int page) throws PageOutOfRange;

    void nextPage();

    void previousPage();

    int activePage();

    void goToLastPage();

    void goToFirstPage();

    void zoom(int percentage);


}

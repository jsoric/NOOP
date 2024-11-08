package ex_pckg;

public class Client {

    private ComicReader comicReader;

    public Client() {
        System.out.println("Some client that has expects ComicReader!");
    }

    public void setComicReader(ComicReader comicReader) {
        this.comicReader = comicReader;
    }

    public void skipToNextPage() {
        comicReader.next();
    }

    public void skipToPreviousPage() {
        comicReader.previous();
    }

    public void giveMeLastPage() {
        comicReader.last();
    }

    public void giveMeFirstPage() {
        comicReader.first();
    }

    public void setSomeZoom(int perc) {
        comicReader.zoom(perc);
    }

    public void turnNightModeON() {
        comicReader.nightReadingMode(true);
    }

    public void turnNightModeOFF() {
        comicReader.nightReadingMode(false);
    }

    public void giveMeThisPage(int page) {
        try {
            comicReader.goToPage(page);
        } catch (PageOutOfRange por) {
            System.out.println(por.getMessage());
        }
    }

    public void giveMeCurrentPage() {
        System.out.println("Current page: " + comicReader.currentPage());
    }
}

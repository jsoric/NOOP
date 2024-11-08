package ex_pckg;

public class SimpleComicReader implements ComicReader{

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private static final int MAXPERC = 200;
    private static final int MINPERC = 20;
    private int zoom;
    private boolean nightReading;

    public SimpleComicReader(){
        System.out.println("Ready to read some comics...");
        System.out.println("Please provide some comic to read!");
        nightReading = false;

    }

    public void setComic(Comic comic) {
        this.comic = comic;
        this.currentPage = 1;
        totalPages = comic.getTotalPages();
        this.zoom = 100;
        System.out.println("Reading this: ");
        System.out.println(comic);
        System.out.println("------------------------------------------------------");
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "SimpleComicReader{" +
                "currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoom=" + zoom +
                ", nightReading=" + nightReading +
                '}';
    }

    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        if(comic != null){
            if(numPage <= totalPages){
                this.currentPage = numPage;
                System.out.println("We are on the page: " + numPage);
            } else {
                throw new PageOutOfRange("Page out of range");
            }
        }
    }

    @Override
    public void next() {

        if (comic != null) {
                if (currentPage < totalPages) {
                    this.currentPage++;
                    System.out.println("Next page is opened: " + currentPage);
                } else {
                    System.out.println("Last page opened - can't go to the next page!");
                }
        }

    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {
        if(comic != null){
            if(currentPage == 1){
                System.out.println("Can't go to previous = we are at the first one!");
            } else {
                this.currentPage --;
                System.out.println("We are one page back: "+currentPage());
            }
        }
    }

    @Override
    public void last() {
        if(comic != null){
            this.currentPage = totalPages;
            System.out.println("The last one is reached");
        }

    }

    @Override
    public void first() {
        if(comic != null){
            this.currentPage = 1;
            System.out.println("First page!");
        }

    }

    @Override
    public void zoom(int percent) {
        if(comic != null){
            if(percent <= MAXPERC && percent > MINPERC){
                this.zoom = percent;
                System.out.println("New zoom: "+zoom);
            }else {
                System.out.println("Wrong percentage for zoom!");
            }
        }
    }

    @Override
    public void nightReadingMode(boolean status) {
        if(comic != null){
            nightReading = status;
            System.out.println("Night reading mode is ON!" + nightReading);
        }
    }

    @Override
    public void changeBrightness(int value) {

    }
}

package ex_pckg;

public class FSTBookReader implements BookReader{

    private Book book;
    private int currentPage;
    private int numPages;
    private static final int MAXP = 150;
    private static final int MINP = 150;
    private int zoom;

    public FSTBookReader(){
        System.out.println("Book reader ready for reading some books!");
    }

    public void setBook(Book book){
        this.book = book;
        this.currentPage = 1;
        this.numPages = book.getTotalPages();
        this.zoom = 100;
        System.out.println(book);
        System.out.println("---------------------------------------------------------");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FSTBookReader{" +
                "book=" + book +
                ", currentPage=" + currentPage +
                ", numPages=" + numPages +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void viewPage(int page) throws PageOutOfRange{
        if(book != null){
            if(page <= numPages){
                this.currentPage = page;
                System.out.println("We are on the "+currentPage);
            } else {
                throw new PageOutOfRange("");
            }
        }
    }

    @Override
    public void nextPage() {
        if(book != null){
            if(currentPage<numPages){
                this.currentPage++;
                System.out.println("We are on the next page!!");
            } else {
                System.out.println("Can not go to the next page - we are already on the last page!");
            }
        }
    }

    @Override
    public void previousPage() {
        if(book != null){
            if(currentPage > 1){
                this.currentPage--;
                System.out.println("We are on page back!!");
            } else {
                System.out.println("Can not go from the first to previous!");
            }
        }
    }

    @Override
    public int activePage() {
        return this.currentPage;
    }

    @Override
    public void goToLastPage() {
        if(book != null){
            this.currentPage = numPages;
            System.out.println("Last page active!");
        }
    }

    @Override
    public void goToFirstPage() {
        if(book != null){
            this.currentPage = 1;
            System.out.println("First page active!");
        }
    }

    @Override
    public void zoom(int percentage) {
        if(book != null){
            if(percentage <= MAXP && percentage >= MINP){
                this.zoom = percentage;
            }else {
                System.out.println("Unsupported zoom percentage!");
            }
        }
    }
}

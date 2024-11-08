package ex_pckg;

public class Book{

    private String title;
    private String author;
    private int totalPages;

    public Book(String title, String author, int totalPages){
        this.author = author;
        this.title = title;
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }
}

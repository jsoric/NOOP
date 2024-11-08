package ex_pckg;

public class AppTest {

    public static void main(String[] args) {
        Comic comic = new Comic("Captain America", "DT & CH", 100);
        SimpleComicReader comicReader = new SimpleComicReader();
        comicReader.setComic(comic);
        Client client = new Client();
        client.setComicReader(comicReader);
        client.skipToNextPage();
        client.giveMeThisPage(101);
        client.turnNightModeON();
        Book book = new Book("The last principe", "A.G.Marty", 230);
        FSTBookReader bookReader = new FSTBookReader();
        bookReader.setBook(book);
        BookToCommicAdapter adapter = new BookToCommicAdapter(bookReader);
        client.setComicReader(adapter);
        client.turnNightModeOFF();
    }
}

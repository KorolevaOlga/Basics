package Book;


import java.util.ArrayList;
import java.util.List;

public class BookBase {
    private ArrayList<Book> base = new ArrayList();

    public void addBookBase(Book book) {
        base.add(book);
    }

    List<Book> authors(String author) {
        List<Book> authors = new ArrayList<>();
        for (Book b: base) {
            if(b.getAuthor().equals(author)) {
                authors.add(b);
            }
        }
        return authors;
    }
    List<Book> publishingHouses(String publishingHouse) {
        List<Book> publishingHouses = new ArrayList<>();
        for(Book b: base) {
            if(b.getPublishingHouse().equals(publishingHouse)) {
                publishingHouses.add(b);
            }
        }
        return publishingHouses;
    }
    List<Book> years(int year) {
        List<Book> years = new ArrayList<>();
        for(Book b: base) {
            if (b.getYear() > year) {
                years.add(b);
            }
        }
        return years;
    }
}

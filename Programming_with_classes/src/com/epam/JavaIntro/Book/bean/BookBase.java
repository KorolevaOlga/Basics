package com.epam.JavaIntro.Book.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookBase {
    private ArrayList<Book> base;

    public BookBase(ArrayList<Book> base) {
        this.base = base;
    }

    public BookBase() {
        this.base = new ArrayList<>();
    }

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
    List<Book> publishing(String publishingHouse) {
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

    public ArrayList<Book> getBase() {
        return base;
    }

    public void setBase(ArrayList<Book> base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookBase)) return false;
        BookBase bookBase = (BookBase) o;
        return Objects.equals(getBase(), bookBase.getBase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBase());
    }

    @Override
    public String toString() {
        return "BookBase{" +
                "base=" + base +
                '}';
    }
}

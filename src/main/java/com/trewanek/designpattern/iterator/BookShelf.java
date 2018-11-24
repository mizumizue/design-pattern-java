package com.trewanek.designpattern.iterator;

import java.util.List;
import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private List<Book> books;

    public BookShelf() {
        books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
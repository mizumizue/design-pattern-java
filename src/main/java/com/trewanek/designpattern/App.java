package com.trewanek.designpattern;

import com.trewanek.designpattern.iterator.Book;
import com.trewanek.designpattern.iterator.BookShelf;
import com.trewanek.designpattern.iterator.Iterator;

public class App 
{
    public static void main( String[] args )
    {
        quickStartIterator();
    }

    public static void quickStartIterator() {
        BookShelf booksShelf = new BookShelf();
        String[] bookTitles = {
            "Alice In Wonderland",
            "World Wide Web",
            "Java Fundamental",
            "New Book"
        };
        for (String title : bookTitles) {
            Book book = new Book(title);
            booksShelf.appendBook(book);
        }
        Iterator i = booksShelf.iterator();
        while(i.hasNext()) {
            Book book = (Book) i.next();
            System.out.println(book.getName());
        }
    }
}

package com.trewanek.designpattern;

import com.trewanek.designpattern.iterator.Book;
import com.trewanek.designpattern.iterator.BookShelf;
import com.trewanek.designpattern.iterator.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        quickStartIterator();
    }

    public static void quickStartIterator() {
        BookShelf booksShelf = new BookShelf(3);
        Book book1 = new Book("Alice in Wornderland");
        Book book2 = new Book("World Wide Web");
        Book book3 = new Book("Java Fundermental");
        booksShelf.appendBook(book1);
        booksShelf.appendBook(book2);
        booksShelf.appendBook(book3);
        Iterator i = booksShelf.iterator();
        while(i.hasNext()) {
            Book book = (Book) i.next();
            System.out.println(book.getName());
        }
    }
}

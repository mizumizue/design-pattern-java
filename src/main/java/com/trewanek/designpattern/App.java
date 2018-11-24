package com.trewanek.designpattern;

import com.trewanek.designpattern.iterator.Book;
import com.trewanek.designpattern.iterator.BookShelf;
import com.trewanek.designpattern.iterator.Iterator;

import com.trewanek.designpattern.adaptersubclass.Print;
import com.trewanek.designpattern.adaptersubclass.PrintBanner;

public class App 
{
    public static void main( String[] args )
    {
        quickStartIterator();
        quickStartAdapterSubclass();
        quickStartAdapterTransfer();
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

    public static void quickStartAdapterSubclass() {
        Print print = new PrintBanner("Hello AdapterSubclass!");
        print.printWeak();
        print.printStrong();
    }

    public static void quickStartAdapterTransfer() {
        com.trewanek.designpattern.adaptertransfer.Banner banner = 
            new com.trewanek.designpattern.adaptertransfer.Banner("Hello AdapterTransfer!");
        com.trewanek.designpattern.adaptertransfer.Print print =
            new com.trewanek.designpattern.adaptertransfer.PrintBanner(banner);
        print.printWeak();
        print.printStrong();
    }
}

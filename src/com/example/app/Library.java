package com.example.app;

import java.util.List;


public class Library {
    private static List<Book> books;
    private static List<Reader> readers;
    

//    public Library(List<Book> books, List<Reader> readers) {
//        this.books = books;
//        this.readers = readers;
//    }

    public static List<Book> getBooks() {
        return books;
    }

    public static List<Reader> getReaders() {
        return readers;
    }

    public static void newBook(Book book) {
        books.add(book);
    }

    public static void newReader(Reader reader) {
        readers.add(reader);
    }

    
     public void lendBook() {
        
    }

    public void takeBackBook() {

    }

    public void showBook() {

    }

}
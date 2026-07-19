package com.example.app.model.Library;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Member.People.Person;
import com.example.app.model.Member.People.Reader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class Library {
    //private static List<Book> books;
    private static List<Reader> readers = new ArrayList<>();
    private static Map<String, Book> books = new HashMap<>();
    private static Integer maxBookLimit = 5;

    public static Integer getMaxBookLimit() {
        return maxBookLimit;
    }

    public static List<Book> getBooks() {

        return books.values().stream().toList();
    }

    public static List<Reader> getReaders() {
        return readers;
    }


    public static void newBook(Book book) {

        books.put(book.id,book);

    }

    public static void newReader(Reader reader) {
        readers.add(reader);
    }

    
     public void lendBook(Book book, Person person) {
        
    }

    public void takeBackBook() {

    }

    public void showBook() {

    }

}
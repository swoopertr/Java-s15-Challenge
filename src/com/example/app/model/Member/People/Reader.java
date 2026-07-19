package com.example.app.model.Member.People;

import com.example.app.model.Library.Book.Book;

import java.util.List;

public class Reader extends Person {
    private List<Book> books;

    public Reader(String name, int tcNo, List<Book> books) {
        super(name, tcNo);
        this.books = books;
    }

    public void purcahaseBook(){
        System.out.println("Hello world!");
    }

    public void borrowBook(){
        System.out.println("Hello world!");
    }

    public void returnBook(){
        System.out.println("Hello world!");
    }

    public void showBook(){
        System.out.println("Hello world!");
    }

    public List<Book> getBooks() {
        return this.books;
    }

    @Override
    public String whoYouAre() {
        return this.getName();
    }
}
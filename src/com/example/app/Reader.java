package com.example.app;

import java.util.List;

public class Reader extends Person{
    private List<Book> books;

    public Reader(List<Book> books, String name )
    {
        super(name);
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
}
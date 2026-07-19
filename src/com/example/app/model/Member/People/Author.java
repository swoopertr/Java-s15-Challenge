package com.example.app.model.Member.People;

import com.example.app.model.Library.Book.Book;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> books;

    public Author(String name, int tcNo, List<Book> books) {
        super(name, tcNo);
        this.books = books;
    }

    public Author(String name, int tcNo) {
        super(name, tcNo);
        this.books = new ArrayList<>();
    }



    public List<Book> booksgetBooks() {
        return books;
    }

    @Override
    public String whoYouAre()
    {
       return this.getName();
    }

    public void showBook(){

    }

    public void newBook(Book newBook){
        this.books.add(newBook);
    }

     
}
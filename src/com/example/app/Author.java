package com.example.app;

import java.util.List;

public class Author extends Person{
    private List<Book> books;

    public Author(String name, List<Book> books) {
        super(name);
        this.books = books;
    }

    public List<Book> booksgetBooks() {
        return books;
    }

    @Override
    public String whoYouAre()
    {
       return super.whoYouAre();
    }

    public void showBook(){

    }

    public void newBook(Book newBook){
        this.books.add(newBook);
    }

     
}
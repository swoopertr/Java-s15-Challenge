package com.example.app.model.People;

import com.example.app.model.Book.BookMethods;
import com.example.app.model.Book.Book;
import com.example.app.model.Library.Library;

import java.util.List;

public class Librarian extends Person implements BookMethods {

    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public List<Book> searchBook(String text) {
        return Library.getBooks();
    }

    public boolean verifyMember() {
        return true;
    }

    public void issueBook() {
        System.out.println("Book is issued");       
    }

    public double calculateFine() {
        return 0;
    }

    public void createBill() {
        System.out.println("Bill is created.");
    }


    @Override
    public String whoYouAre() {
        return this.getName();
    }

    @Override
    public void return_book() {
        //???
        System.out.println("Book is returned.");
    }

     public void new_book(Book book) {
        Library.newBook(book);
    }

    @Override
    public void borrow_book() {

    }
}
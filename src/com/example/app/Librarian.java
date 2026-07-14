package com.example.app;

import java.util.List;

public class Librarian extends Person {
    
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

    public void returnBook() {
        System.out.println("Book is returned.");
    }





}
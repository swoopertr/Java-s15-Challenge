package com.example.app;

public class Book {
    public String id;
    public Author author;
    public String name;
    public int price;
    public String status;
    public String edition;
    public String dateOfPurchase;
    public Student owner; 

    public Book(String id, Author author, String name, int price,
                String status, String edition, String dateOfPurchase,Student owner) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
        this.owner = owner; 
    }


    public String get_title() {
        return this.name;
    }


    public Author getauthor() {
        return this.author;
    }


    public void changeOwner(Student newOwner) {
        this.owner = newOwner;
    }


    public Student getOwner() {
        return this.owner;
    }


    public void display() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + name);
        System.out.println("Author: " + author.whoYouAre());
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
        System.out.println("Edition: " + edition);
        System.out.println("Date of Purchase: " + dateOfPurchase);
        System.out.println("Owner: " + owner);
    }


    public void update_status(String newStatus) {
        this.status = newStatus;
    }
}

package com.example.app.model;

public class Magazines extends Book {

    public Magazines(String id, Author author, String name, int price,
                     String status, String edition, String dateOfPurchase) {
        super(id, author, name, price, status, edition, dateOfPurchase,null);
    }

    
}

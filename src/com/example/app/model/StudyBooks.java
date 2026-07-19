package com.example.app.model;

public class StudyBooks extends Book {

    public StudyBooks(String id, Author author, String name, int price,
                      String status, String edition, String dateOfPurchase) {
        super(id, author, name, price, status, edition, dateOfPurchase, null);
    }

    
}

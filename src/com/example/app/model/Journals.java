package com.example.app.model;

import com.example.app.model.Book.Book;
import com.example.app.model.People.Author;

public class Journals extends Book {

    public Journals(String id, Author author, String name, int price,
                    String status, String edition, String dateOfPurchase) {
        super(id, author, name, price, status, edition, dateOfPurchase, null);
    }

   
}

package com.example.app.model.Library.Book;

import com.example.app.model.Member.People.Author;
import com.example.app.model.Member.People.Person;
import com.example.app.model.Member.People.Student;

import java.time.LocalDate;

public class Magazines extends Book {

    public Magazines(String id, Author author, String name, int price, Boolean status, String edition, LocalDate dateOfPurchase, Person owner) {
        super(id, author, name, price, status, edition, dateOfPurchase, owner);
    }
}

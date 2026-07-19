package com.example.app.model.Library.Book;

import com.example.app.model.Member.People.Author;
import com.example.app.model.Member.People.Student;

import java.time.LocalDate;

public class StudyBooks extends Book {

    public StudyBooks(String id, Author author, String name, int price, Boolean status, String edition, LocalDate dateOfPurchase, Student owner) {
        super(id, author, name, price, status, edition, dateOfPurchase, owner);
    }
}

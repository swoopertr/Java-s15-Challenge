package com.example.app.service.Interface;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Member.Faculty;
import com.example.app.model.Member.People.Person;

import java.util.List;

public interface Member {

    List<Book> bookList(Person person);
    List<Book> bookList(Faculty faculty);

}

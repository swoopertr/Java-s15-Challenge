package com.example.app.service.Implementation;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Library.Library;
import com.example.app.model.Member.Faculty;
import com.example.app.model.Member.People.Person;
import com.example.app.service.Interface.Invoice;
import com.example.app.service.Interface.Member;

import java.util.List;

public class MemberService implements Member {


    @Override
    public List<Book> bookList(Person person) {

        Library.getBooks();
        return List.of();
    }

    @Override
    public List<Book> bookList(Faculty faculty) {
        return List.of();
    }
}

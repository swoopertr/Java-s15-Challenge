package com.example.app.service.Implementation;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Member.Faculty;
import com.example.app.model.Member.People.Person;
import com.example.app.service.Interface.Invoice;

import java.util.List;

public class InvoiceService implements Invoice {
    @Override
    public void createInvoice(List<Book> books, Person person) {

    }

    @Override
    public void createInvoice(List<Book> books, Faculty faculty) {

    }
}

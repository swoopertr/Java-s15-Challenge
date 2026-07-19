package com.example.app;


import com.example.app.model.Library.Book.Book;
import com.example.app.model.Library.Library;
import com.example.app.model.Member.People.Author;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Kemal Tahir",12345);
        Book book1 = new Book("#123",author1,"Esir Şehrin İnsanları",450,
                true,"4. Baskı", LocalDate.now(),null);
        Library.newBook(book1);

        System.out.println(Library.getBooks());
    }
}
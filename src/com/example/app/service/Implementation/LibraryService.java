package com.example.app.service.Implementation;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Library.Category;
import com.example.app.model.Member.People.Person;

import java.util.List;

public class LibraryService implements com.example.app.service.Interface.LibraryService {
    @Override
    public void updateBook(String id, String newTitle, double newPrice) {

    }

    @Override
    public void deleteBook(String id) {

    }

    @Override
    public List<Book> listBooksByCategory(Category category) {
        return List.of();
    }

    @Override
    public void listBooksByAuthor(String authorName) {

    }

    @Override
    public void borrowBook(String userId, String bookId) {

    }

    @Override
    public void returnBook(String userId, String bookId) {

    }

    @Override
    public Boolean leanBook(String bookId, Person person) {
        return null;
    }
}

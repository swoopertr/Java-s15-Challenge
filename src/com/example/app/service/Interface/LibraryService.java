package com.example.app.service.Interface;

import com.example.app.model.Library.Book.Book;
import com.example.app.model.Library.Category;
import com.example.app.model.Member.People.Person;

import java.util.List;

public interface LibraryService {

    void updateBook(String id, String newTitle, double newPrice);
    void deleteBook(String id);
    List<Book> listBooksByCategory(Category category);
    void listBooksByAuthor(String authorName);
    void borrowBook(String userId, String bookId);
    void returnBook(String userId, String bookId);
    Boolean leanBook(String bookId, Person person);
}

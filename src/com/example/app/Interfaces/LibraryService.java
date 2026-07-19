package com.example.app.Interfaces;

import com.example.app.model.Category;

public interface LibraryService {



    void updateBook(String id, String newTitle, double newPrice);
    void deleteBook(String id);
    void listBooksByCategory(Category category);
    void listBooksByAuthor(String authorName);
    void borrowBook(String userId, String bookId);
    void returnBook(String userId, String bookId);
}

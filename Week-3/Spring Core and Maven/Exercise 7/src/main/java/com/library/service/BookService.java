package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private String bookName;
    private String author;
    private BookRepository bookRepository; // this must match your XML bean reference

    // Constructor Injection
    public BookService(String bookName) {
        this.bookName = bookName;
        System.out.println("Constructor Injection: Book name - " + bookName);
    }

    // Setter Injection
    public void setAuthor(String author) {
        this.author = author;
        System.out.println("Setter Injection: Author - " + author);
    }

    // Setter Injection for BookRepository
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository injected");
    }

    public void displayService() {
        System.out.println("BookService initialized successfully!");
        System.out.println("Book: " + bookName + ", Author: " + author);
    }
}

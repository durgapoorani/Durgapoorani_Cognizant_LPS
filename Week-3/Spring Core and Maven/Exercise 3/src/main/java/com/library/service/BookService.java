package com.library.service;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    public void issueBook() {
        System.out.println("BookService: Issuing a book...");
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("BookService: Book issued successfully.");
    }
}

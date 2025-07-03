package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        // Load XML-based Spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call the method to test DI
        bookService.printBookTitle();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
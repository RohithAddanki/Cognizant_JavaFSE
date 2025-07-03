package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryApp {
    public static void main(String[] args) {
        // Load Spring Context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get BookService Bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use service
        bookService.printBookTitle();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
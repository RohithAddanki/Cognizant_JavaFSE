package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldResTfulWebServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldResTfulWebServiceApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        SpringApplication.run(HelloWorldResTfulWebServiceApplication.class, args);
        LOGGER.info("END");
    }
}
package com.cognizant.spring_learn2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearn2Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearn2Application.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        displayCountry();
        LOGGER.info("END");
    }

    public static void displayCountry() {
        System.out.println("displayCountry() method called");  // for quick check
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.info("Country: {}", country.toString());
    }
}
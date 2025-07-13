package com.cognizant.springlearn.spring_core;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.spring_core.model.Country;

@SpringBootApplication
public class SpringCoreApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);

        // Load XML context once
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        displayCountry(context);
        displayCountries(context);
    }

    public static void displayCountry(ApplicationContext context) {
        Country country = context.getBean("country", Country.class);
        LOGGER.debug("Single Country: {}", country);
    }

    @SuppressWarnings("unchecked")
    public static void displayCountries(ApplicationContext context) {
        List<Country> countryList = (List<Country>) context.getBean("countryList");
        for (Country c : countryList) {
            LOGGER.debug("Country from list: {}", c);
        }
    }
}

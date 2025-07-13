package com.cognizant.spring_core_xml;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreXmlApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCoreXmlApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreXmlApplication.class, args);
        LOGGER.info("SpringCoreXmlApplication started");

        displayCountries();
    }

    @SuppressWarnings("unchecked")
    public static void displayCountries() {
        LOGGER.info("START - displayCountries()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country c : countries) {
            LOGGER.debug("{}", c);
        }

        LOGGER.info("END - displayCountries()");
    }
}

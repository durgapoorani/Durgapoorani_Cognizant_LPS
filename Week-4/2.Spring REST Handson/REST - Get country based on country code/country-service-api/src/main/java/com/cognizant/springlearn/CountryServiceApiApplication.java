package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource; // 👈 Important

@SpringBootApplication
@ImportResource("classpath:country.xml") 
public class CountryServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApiApplication.class, args);
    }
}

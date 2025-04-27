package com.laioffer.silvergame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SilverGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(SilverGameApplication.class, args);
    }

}

// This is the main entry point for the Spring Boot application.
// It uses the @SpringBootApplication annotation to enable auto-configuration, component scanning, and other features. The main method runs the application using SpringApplication.run().
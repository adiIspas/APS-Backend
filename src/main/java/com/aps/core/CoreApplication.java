package com.aps.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        int i = 1;
        i = i + 1;
        SpringApplication.run(CoreApplication.class, args);
    }
}

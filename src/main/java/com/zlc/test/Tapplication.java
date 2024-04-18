package com.zlc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Tapplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Tapplication.class, args);
    }
}

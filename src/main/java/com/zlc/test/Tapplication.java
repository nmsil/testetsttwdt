package com.zlc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Tapplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Tapplication.class, args);
        System.out.println("git1111111111111");
        System.out.println("git2222222222222");
    }
}

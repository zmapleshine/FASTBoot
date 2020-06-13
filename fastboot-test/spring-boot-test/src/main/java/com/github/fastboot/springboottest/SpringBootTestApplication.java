package com.github.fastboot.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        System.out.println(SpringBootVersion.getVersion());
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

}

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App1Application {
    public static void main(String[] args) {
        SpringApplication.run(App1Application.class, args);
    }

    @GetMapping("/app1")
    public String hello() {
        return "Hello World 1";
    }
}

package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {
        return "Spring Boot Gradle Project Running Successfully";
    }
}
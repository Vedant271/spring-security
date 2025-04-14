package com.javaproject.security.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Hello World "+request.getSession().getId();
    }

    @GetMapping("/home")
    public String home(HttpServletRequest request){
        return "Welcome to home "+request.getSession().getId();
    }
}

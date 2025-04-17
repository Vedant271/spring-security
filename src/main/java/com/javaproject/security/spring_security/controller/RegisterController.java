package com.javaproject.security.spring_security.controller;

import com.javaproject.security.spring_security.model.User;
import com.javaproject.security.spring_security.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return registerService.registerUser(user);
    }
}

package com.example.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String getSomething(){
        return "It works";
    }

    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setUsername("punchik");
        user.setPassword("9999");
        user.setEmail("okuziura@gmail.com");
        user.setName("Oleg");
        user.setSurname("Sandro");
        return user;
    }
}

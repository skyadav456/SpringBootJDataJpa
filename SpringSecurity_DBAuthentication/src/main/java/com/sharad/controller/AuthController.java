package com.sharad.controller;

import com.sharad.entity.User;
import com.sharad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String welcome(){
        return "Welcome to Sharad!";
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        userService.register(user);
        return "User registered successfully!"+ user.getPassword();
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.findAll();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Public API working!";
    }
}

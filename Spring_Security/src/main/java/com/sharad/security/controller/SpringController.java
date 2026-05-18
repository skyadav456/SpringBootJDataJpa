package com.sharad.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user!";
    }

    @GetMapping("/public")
    public String publicPage() {
        return "This is a public page!";
    }
}

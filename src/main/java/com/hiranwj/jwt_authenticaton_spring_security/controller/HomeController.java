package com.hiranwj.jwt_authenticaton_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getHello() {
        return "Hi";
    }

    @PostMapping("/login")
    public String getLogin() {
        return "User login";
    }
}

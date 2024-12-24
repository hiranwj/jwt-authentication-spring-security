package com.hiranwj.jwt_authenticaton_spring_security.controller;

import com.hiranwj.jwt_authenticaton_spring_security.service.JWTService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final JWTService jwtService;

    public HomeController(JWTService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping
    public String getHello() {
        return "Hi";
    }

    @PostMapping("/login")
    public String getLogin() {
//        return "User login";
        return jwtService.getJWTToken();
    }

    @GetMapping("/username")
    public String getUsername(@RequestParam String token) {
        return jwtService.getUserName(token);
    }
}

package com.example.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
	// http://localhost:8080/
	// login with
	// username=admin
	// password=password
    @GetMapping("/")
    public String helloAdmin() {
        return "hello admin";
    }
}
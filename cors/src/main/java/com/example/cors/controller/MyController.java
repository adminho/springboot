package com.example.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Cite: https://spring.io/guides/gs/rest-service-cors/

@RestController
public class MyController {
   
   // GET URL: http://localhost:8080/greeting
   @GetMapping("/greeting")
   // วิธีที่ 2 Controller Method CORS Configuration
   @CrossOrigin(origins = "http://localhost:8080")
   public String greeting() {
		return "Hello World!";
	}
}

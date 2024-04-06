package com.example.reactiveweb.controller;

import lombok.RequiredArgsConstructor; 
import org.springframework.http.HttpStatus; 
import org.springframework.web.bind.annotation.*;

import com.example.reactiveweb.model.User;
import com.example.reactiveweb.service.UserService;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
  
// REST controller for handling user-related endpoints 
@RestController
@RequiredArgsConstructor
public class UserController { 
	// cite: https://www.geeksforgeeks.org/spring-webflux-testing/
    // Final field for UserService 
    private final UserService userService; 
  
    // Endpoint to get a user by ID 
    @GetMapping("/users/{id}") 
    public Mono<User> getUserById(@PathVariable String id) { 
        return userService.getUserById(id); 
    } 
  
    // Endpoint to get all users 
    @GetMapping("/users") 
    public Flux<User> getAllUsers() { 
        return userService.getAllUsers(); 
    } 
  
    // Endpoint to save a user 
    @PostMapping("/users") 
    @ResponseStatus(HttpStatus.CREATED) 
    public Mono<Void> saveUser(@RequestBody User user) { 
        return userService.saveUser(user); 
    } 
} 
package com.example.reactiveweb.service;

import org.springframework.stereotype.Service;

import com.example.reactiveweb.model.User;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
  
// Service annotation to indicate that this interface is a service 
@Service
public interface UserService { 
	// cite: https://www.geeksforgeeks.org/spring-webflux-testing/
    // Method to get a user by ID 
    Mono<User> getUserById(String id); 
  
    // Method to get all users 
    Flux<User> getAllUsers(); 
  
    // Method to save a user 
    Mono<Void> saveUser(User user); 
} 
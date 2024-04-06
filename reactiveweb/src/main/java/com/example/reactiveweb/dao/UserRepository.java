package com.example.reactiveweb.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository; 
import org.springframework.stereotype.Repository;

import com.example.reactiveweb.model.User;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
  
// repository annotation to indicate that this interface is a repository 
@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> { 
	// cite: https://www.geeksforgeeks.org/spring-webflux-testing/
    // method to find a user by ID 
    Mono<User> findById(String id); 
  
    // Method to find all users 
    Flux<User> findAll(); 
  
    // Method to save a user 
    Mono<Void> save(User user); 
} 

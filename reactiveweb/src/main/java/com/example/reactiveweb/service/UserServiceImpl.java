package com.example.reactiveweb.service;

import lombok.RequiredArgsConstructor; 
import org.springframework.stereotype.Service;

import com.example.reactiveweb.dao.UserRepository;
import com.example.reactiveweb.model.User;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
  
// Service implementation class for UserService interface 
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService { 
    // Final field for UserRepository 
    private UserRepository userRepository; 
  
    // Method to get a user by ID 
    @Override
    public Mono<User> getUserById(String id) { 
        return userRepository.findById(id); 
    } 
  
    // Method to get all users 
    @Override
    public Flux<User> getAllUsers() { 
        return userRepository.findAll(); 
    } 
  
    // Method to save a user 
    @Override
    public Mono<Void> saveUser(User user) { 
        return userRepository.save(user); 
    }

} 
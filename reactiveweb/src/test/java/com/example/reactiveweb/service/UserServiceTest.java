package com.example.reactiveweb.service;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test;

import com.example.reactiveweb.dao.UserRepository;
import com.example.reactiveweb.model.User;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
import reactor.test.StepVerifier; 
  
import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.when; 
  
// Unit tests for UserService class 
class UserServiceTest { 
	// cite: https://www.geeksforgeeks.org/spring-webflux-testing/
    private UserService userService; 
    private UserRepository userRepository; 
  
    // Set up mock UserRepository and UserService before each test 
    @BeforeEach
    void setUp() { 
        userRepository = mock(UserRepository.class); 
        userService = new UserServiceImpl(userRepository); 
    } 
  
    // Test for retrieving a user by ID 
    @Test
    void getUserById() { 
        User user = new User("1", "Sweta", 24); 
        when(userRepository.findById("1")).thenReturn(Mono.just(user)); 
  
        Mono<User> result = userService.getUserById("1"); 
  
        StepVerifier.create(result) 
                .expectNext(user) 
                .verifyComplete(); 
    } 
  
    // Test for retrieving all users 
    @Test
    void getAllUsers() { 
        User user1 = new User("1", "Sweta", 24); 
        User user2 = new User("2", "Ami", 26); 
        when(userRepository.findAll()).thenReturn(Flux.just(user1, user2)); 
  
        Flux<User> result = userService.getAllUsers(); 
  
        StepVerifier.create(result) 
                .expectNext(user1) 
                .expectNext(user2) 
                .verifyComplete(); 
    } 
  
    // Test for saving a user 
    @Test
    void saveUser() { 
        User user = new User("1", "Sweta", 24); 
        when(userRepository.save(user)).thenReturn(Mono.empty()); 
  
        Mono<Void> result = userService.saveUser(user); 
  
        StepVerifier.create(result) 
                .verifyComplete(); 
    } 
} 
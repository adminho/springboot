package com.example.reactiveweb.controller;

import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test; 
import org.springframework.http.MediaType; 
import org.springframework.test.web.reactive.server.WebTestClient;

import com.example.reactiveweb.model.User;
import com.example.reactiveweb.service.UserService;

import reactor.core.publisher.Flux; 
import reactor.core.publisher.Mono; 
  
import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.when; 
  
// Unit tests for UserController class 
class UserControllerTest { 
	// cite: https://www.geeksforgeeks.org/spring-webflux-testing/ 
    private WebTestClient webTestClient; 
    private UserService userService; 
  
    // Set up mock UserService and WebTestClient before each test 
    @BeforeEach
    void setUp() { 
        userService = mock(UserService.class); 
        webTestClient = WebTestClient.bindToController(new UserController(userService)).build(); 
    } 
  
    // Test for retrieving a user by ID 
    @Test
    void getUserById() { 
        User user = new User("1", "Sweta", 24); 
        when(userService.getUserById("1")).thenReturn(Mono.just(user)); 
  
        webTestClient.get().uri("/users/1") 
                .exchange() 
                .expectStatus().isOk() 
                .expectBody(User.class).isEqualTo(user); 
    } 
  
    // Test for retrieving all users 
    @Test
    void getAllUsers() { 
        User user1 = new User("1", "Sweta", 24); 
        User user2 = new User("2", "Ami", 26); 
        when(userService.getAllUsers()).thenReturn(Flux.just(user1, user2)); 
  
        webTestClient.get().uri("/users") 
                .exchange() 
                .expectStatus().isOk() 
                .expectBodyList(User.class).contains(user1, user2); 
    } 
  
    // Test for saving a user 
    @Test
    void saveUser() { 
        User user = new User("1", "Sweta", 24); 
        when(userService.saveUser(user)).thenReturn(Mono.empty()); 
  
        webTestClient.post().uri("/users") 
                .contentType(MediaType.APPLICATION_JSON) 
                .body(Mono.just(user), User.class) 
                .exchange() 
                .expectStatus().isCreated(); 
    } 
} 
package com.example.lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lifecycle.model.Car;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// Cite: https://tountoon.medium.com/spring-core-แบบโง่ๆ-1f2d098fd06b

@SpringBootApplication
public class LifecycleApplication {

	@Autowired
	private Car car;
	 
	public static void main(String[] args) {
		SpringApplication.run(LifecycleApplication.class, args);
	}
	
    @PostConstruct
    public void init() throws Exception {
        System.out.println("Main application has been instantiated and I'm the init() method");
        System.out.print("Car is injected: " + car);
    }
 
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println( "Container has been closed and I'm the destroy() method from main application");
    }
}

package com.example.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.lifecycle.model.Car;

@Configuration
public class MyConfig {
	@Bean
	Car getCar() {
		return new Car("red");
	}
}

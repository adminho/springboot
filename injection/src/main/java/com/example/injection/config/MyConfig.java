package com.example.injection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.injection.model.Car;
import com.example.injection.model.Dog;
import com.example.injection.model.Person;


@Configuration
public class MyConfig {
	@Bean
	Car getCar() {
		return new Car("red");
	}
	
	@Bean
	Dog getDog() {
		return new Dog("Bulldog");
	}
		
	@Bean
	Person getPerson() {
		return new Person(40);
	}
	
	@Bean
	String getString() {
		return "Inject the string into a bean";
	}
}

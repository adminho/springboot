package com.example.context.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.context.model.Car;
import com.example.context.model.Dog;
import com.example.context.model.Person;


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

}

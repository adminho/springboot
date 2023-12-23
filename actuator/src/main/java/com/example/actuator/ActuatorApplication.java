package com.example.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_actuator.htm
// Cite: https://www.baeldung.com/spring-boot-actuators
// http://localhost:8080/actuator

@SpringBootApplication
@RestController
public class ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}

	@GetMapping("/greeting")
	public String gretting() {
		return "Hello World!";
	}
}

package com.example.reactiveweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, XADataSourceAutoConfiguration.class})
public class ReactivewebApplication {
    // cite: 
	// https://github.com/adminho/spring-boot-reactive-example
	// https://github.com/adminho/spring-boot-reactive-example/blob/main/spring-boot-reactive-controller/README.md
	public static void main(String[] args) {
		SpringApplication.run(ReactivewebApplication.class, args);
	}

}

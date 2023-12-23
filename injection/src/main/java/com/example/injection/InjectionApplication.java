package com.example.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.injection.comp.MyCom;

@SpringBootApplication
public class InjectionApplication implements CommandLineRunner {
	
	@Autowired
	private MyCom myCom;
	 
	public static void main(String[] args) {
		SpringApplication.run(InjectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		myCom.toDo();
	}

}

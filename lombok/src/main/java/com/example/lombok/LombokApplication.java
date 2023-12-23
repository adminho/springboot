package com.example.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lombok.model.Person;

@SpringBootApplication
public class LombokApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p = new Person("สมชาบ","รักเรียน", 12);
		System.out.println(p.getFirstname());
		System.out.println(p.getLastname());
		System.out.println(p.getAge());
		System.out.println(p);		
	}

}

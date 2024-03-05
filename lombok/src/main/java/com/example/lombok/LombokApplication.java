package com.example.lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lombok.model.Person;
import com.example.lombok.model.Widget;

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
		
		Widget testWidget = Widget.builder()
				  .name("foo")
				  .id(123456)
				  .build();
		
		System.out.println(testWidget.getName());
		System.out.println(testWidget.getId());
	}

}

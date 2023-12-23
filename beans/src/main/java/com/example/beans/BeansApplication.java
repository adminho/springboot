package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.beans.model.Lion;

@SpringBootApplication
public class BeansApplication implements CommandLineRunner{

	@Autowired
	private Lion lion;
	
	public static void main(String[] args) {
    	SpringApplication.run(BeansApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		System.out.println(lion != null? lion.getName():"Not have lion bean");
	}
	
}

package com.example.lombok.model;

import lombok.Data;

@Data
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
}

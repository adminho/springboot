package com.example.jdbc.model;

import lombok.Data;

@Data
public class Customer {
	private long id;
	private String firstName, lastName;
	
	public Customer() {
		super();
	}

	public Customer(long id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
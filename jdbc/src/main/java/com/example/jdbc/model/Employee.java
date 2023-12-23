package com.example.jdbc.model;

import lombok.Data;

@Data
public class Employee {
    private int id;

    private String firstName;

    private String lastName;

    private String address;
    
	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

}
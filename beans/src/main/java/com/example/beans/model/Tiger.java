package com.example.beans.model;

import lombok.Data;

@Data
public class Tiger {
	private String name;
	
	public Tiger(String name) {
		super();
		this.name = name;
	}
}

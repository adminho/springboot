package com.example.beans.model;

import lombok.Data;

@Data
public class Lion {
	 private String name;

	public Lion(String name) {
		super();
		this.name = name;
	}	
}

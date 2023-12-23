package com.example.injection.model;

public class Car {
	private String color;

	public Car(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
}

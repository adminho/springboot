package com.example.lifecycle.model;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

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

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Car has been instantiated and I'm the init() method");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Container has been closed and I'm the destroy() method from Car object");
	}

}
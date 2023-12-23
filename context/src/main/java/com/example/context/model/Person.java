package com.example.context.model;

public class Person {
	private int age;

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	public Person(int age) {
		super();
		this.age = age;
	}
}

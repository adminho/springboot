package com.example.injection.model;

public class Dog {
	private String species;

	@Override
	public String toString() {
		return "Dog [species=" + species + "]";
	}

	public Dog(String species) {
		super();
		this.species = species;
	}
}

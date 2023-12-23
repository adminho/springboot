package com.example.injection.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.injection.model.Car;
import com.example.injection.model.Dog;
import com.example.injection.model.Person;

@Component
public class MyCom {
	// รูปแบบ Injection  
	// 1. แบบผ่าน contructor
	private Car car;
	private String msg;
	public MyCom(Car car, String msg) {
	    this.car = car;
	    this.msg = msg;
	}
	
	// 2. แบบผ่านประกาศตัวแปร
	@Autowired
	private Dog dog;
	
	// 3. แบบผ่าน method setter
	private Person person;	
	@Autowired
	private void setPerson(Person person) {
		this.person = person;
	}
	
	public void toDo() {
		System.out.println(car);
		System.out.println(dog);
		System.out.println(person);
		System.out.println(msg);
	}
}

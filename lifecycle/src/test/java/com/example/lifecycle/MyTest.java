package com.example.lifecycle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.example.lifecycle.model.Car;

@SpringBootTest
public class MyTest {
	@Autowired
	private Car car;
	
	@BeforeTestClass
	public static void setup() {
		System.out.println("Setup...");
	}
	
	@AfterTestClass
	public static void close() {
		System.out.println("Close...");
	}
	
	
	@BeforeEach
	public void beforeTestCase() {
		System.out.println("Before testsing");
	}
	
	@Test 
	public void test1(){
		System.out.println("Testiing 1");		
	}
	
	@Test 
	public void test2(){
		System.out.println("Testiing 2");		
	}
	
	@AfterEach 
	public void afterTestCase() {
		System.out.println("After testing");	
	}
}

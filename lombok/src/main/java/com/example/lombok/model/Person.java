package com.example.lombok.model;

import lombok.Data;
// การใช้ lombok 
// 1) ดาวน์โหลดไฟล์ lombok.jar
// 2) ดับเบิลคลิก lombok.jar -> เลือกไฟล์ eclipse.exe, SpringToolSuite4.exe ที่จะปล้๊กอิน lombok เข้าไป
// ปัญหาที่เคยเจอ สร้างโฟลเดอร์ Workspace ไว้ที่โฟลเดอร์หนึ่ง แต่ import โฟลเดอร์โปรเจค lombok อีกโฟลเดอร์กัน ก็จะใช้งาน lombok ไม่ได้
@Data
public class Person {
	private String firstname;
	private String lastname;
	private int age;
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
}

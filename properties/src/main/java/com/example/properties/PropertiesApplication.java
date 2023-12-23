package com.example.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.properties.comp.ConfigData;

@SpringBootApplication
public class PropertiesApplication implements CommandLineRunner{

	@Value("${spring.application.name}")
	private String name;

	@Autowired
	private ConfigData configData;

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println( name + " has URL :" + configData.getURL());
		
	}	
}

/*
 * https://www.tutorialspoint.com/spring_boot/spring_boot_application_properties
 * .htm #รัน spring boot ระบุ port java -jar properties-0.0.1-SNAPSHOT.jar
 * --server.port=9090
 * 
 * #เลือก profile (เลือกไฟล์ properties) java -jar properties-0.0.1-SNAPSHOT.jar
 * --spring.profiles.active=dev
 * 
 * #Externalized Properties java -jar
 * -Dspring.config.location=D:\MyTutor\properties\src\main\resources\application
 * -dev.properties properties-0.0.1-SNAPSHOT.jar
 * 
 * #ถ้าจะรันผ่าน Sptring Tool Suite เพื่อเปลี่ยน profile -> Run Configuraltions... หรือ Debug
 * Configuraltions... --> ตรงแท็บ Spring Boot เลือก profiles ตามต้องการ
 */

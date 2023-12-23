package com.example.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.context.comp.Message;
import com.example.context.config.MyConfig;
import com.example.context.model.Car;
import com.example.context.model.Dog;
import com.example.context.model.Person;

@SpringBootApplication
public class ContextApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ContextApplication.class, args);
		System.out.println(">>>>>>Test ConfigurableApplicationContext");
		testContext(context);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>>Test ApplicationContext");
		testContext(context);
	}

	private static void testContext(ApplicationContext context) {
		System.out.println(context.getBean(Message.class));
		System.out.println(context.getBean(Car.class));
		System.out.println(context.getBean(Dog.class));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(MyConfig.class));
		
		System.out.println("++++++Get all beans++++++");
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
		  System.out.println(beanName + " : " + context.getBean(beanName).getClass().toString());
		}
	}
}

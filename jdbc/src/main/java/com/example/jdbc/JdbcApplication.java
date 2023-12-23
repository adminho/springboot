package com.example.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jdbc.dao.CustomerDAO;
import com.example.jdbc.dao.EmployeeDAO;
import com.example.jdbc.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {

	// Cite: https://github.com/spring-guides/gs-relational-data-access/blob/main/complete/src/main/java/com/example/relationaldataaccess/RelationalDataAccessApplication.java
	// Cite: https://spring.io/guides/gs/relational-data-access/
	@Autowired
	private CustomerDAO customerDAO; // For example without using datasource
	
	// Cite: https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-jdbc/src/main/java/com/baeldung/spring/jdbc/template/guide
	// Cite: https://www.baeldung.com/spring-jdbc-jdbctemplate
	@Autowired
	private EmployeeDAO employeeDAO; // For example using datasource
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		log.info("++++++Test CustomerDAO++++++");
		customerDAO.todo();
		
		log.info("++++++Test EmpolyeDAO++++++");
		employeeDAO.addEmplyee(100);
		List<Employee> allEmployee = employeeDAO.getAllEmployees();
		allEmployee.forEach(customer -> log.info(customer.toString()));
	}


}

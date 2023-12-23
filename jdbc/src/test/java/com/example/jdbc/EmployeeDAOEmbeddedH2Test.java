package com.example.jdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.example.jdbc.dao.EmployeeDAO;

//Cite: https://www.baeldung.com/spring-jdbctemplate-testing

public class EmployeeDAOEmbeddedH2Test {
	
	// We can create a data source that connects to the H2 database and inject it into the EmployeeDAO class:
	@Test
	public void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
	    DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
	      .addScript("classpath:sql/schema.sql")
	      .addScript("classpath:sql/test-data.sql")
	      .build();

	    EmployeeDAO employeeDAO = new EmployeeDAO();
	    employeeDAO.setDataSource(dataSource);

	    assertEquals(4, employeeDAO.getCountOfEmployees());
	}
}

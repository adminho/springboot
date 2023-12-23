package com.example.jdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jdbc.dao.EmployeeDAO;

//Cite: https://www.baeldung.com/spring-jdbctemplate-testing

@SpringBootTest
//@JdbcTest
//@Sql({"/sql/schema.sql", "/sql/test-data.sql"})
class EmployeeDAOUnitTest {
    
    @Autowired
    EmployeeDAO employeeDAO;

    @Test
    void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {        
      assertEquals(5, employeeDAO.getCountOfEmployees());
    }
}
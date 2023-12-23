package com.example.jdbc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.util.ReflectionTestUtils;

import com.example.jdbc.dao.EmployeeDAO;

// Cite: https://www.baeldung.com/spring-jdbctemplate-testing

@SpringBootTest
public class EmployeeDAOMockTest {
    @Mock
    JdbcTemplate jdbcTemplate;

    //We can mock the JdbcTemplate object so that we don’t need to run the SQL statement on a database:
    @Test
    public void whenMockJdbcTemplate_thenReturnCorrectEmployeeCount() {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        ReflectionTestUtils.setField(employeeDAO, "jdbcTemplate", jdbcTemplate);
        Mockito.when(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM EMPLOYEE", Integer.class))
          .thenReturn(4);

        assertEquals(4, employeeDAO.getCountOfEmployees());
    }
}
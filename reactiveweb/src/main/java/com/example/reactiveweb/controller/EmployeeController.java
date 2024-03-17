package com.example.reactiveweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reactiveweb.dao.Employee;
import com.example.reactiveweb.dao.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
// http:localhost:8080/employees
@RestController
@RequestMapping("/employees")
public class EmployeeController {
		private final EmployeeRepository employeeRepository;

	    public EmployeeController(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }

	    @GetMapping("/{id}")
	    public Mono<Employee> getEmployeeById(@PathVariable String id) {
	        return employeeRepository.findEmployeeById(id);
	    }

	    @GetMapping
	    public Flux<Employee> getAllEmployees() {
	        return employeeRepository.findAllEmployees();
	    }

	    @PostMapping("/update")
	    public Mono<Employee> updateEmployee(@RequestBody Employee employee) {
	        return employeeRepository.updateEmployee(employee);
	    }
}

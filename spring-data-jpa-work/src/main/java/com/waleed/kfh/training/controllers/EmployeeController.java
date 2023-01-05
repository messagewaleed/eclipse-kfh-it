package com.waleed.kfh.training.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.waleed.kfh.training.entities.Employee;
import com.waleed.kfh.training.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@GetMapping("/employees")
	Iterable<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	Optional<Employee> getEmployeeById(@PathVariable Integer id){
		return service.getEmployeeById(id);
	}
	
	
	@PostMapping("/employees")
	void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}
	
	@PutMapping("/employees/{id}")
	void updateEmployeeDetails(@RequestBody Employee employee) {
		service.updateEmployeeDetails(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	void deleteEmployeeDetails(@PathVariable Integer id) {
		service.deleteEmployeeDetails(id);
	}
	
	@GetMapping("/employees/name/{name}")
	List<Employee> getEmployeesByName(@PathVariable String name){
		return service.getEmployeesByName(name);
	}
	
	
	
	
}

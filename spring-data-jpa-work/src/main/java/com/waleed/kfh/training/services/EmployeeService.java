package com.waleed.kfh.training.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waleed.kfh.training.entities.Employee;
import com.waleed.kfh.training.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	public Iterable<Employee> getAllEmployees() {
		return repo.findAll();
		}
	
	public Optional<Employee> getEmployeeById(Integer id) {
		return repo.findById(id);
	}	 
	
	public void addNewEmployee(Employee employee) {
		repo.save(employee);
	}

	public void updateEmployeeDetails(Employee employee) {
		repo.save(employee);
		
	}

	public void deleteEmployeeDetails(Integer id) {
		repo.deleteById(id);
		
	}
	
	public List<Employee> getEmployeesByName(String name) {
		return repo.findByName(name);
	}
	
	
	
	
	
	
	
	
	
}

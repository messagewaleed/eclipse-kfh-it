package com.waleed.kfh.training.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waleed.kfh.training.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByName(String name);
	
	List<Employee> findBySkills(String skills);
	
//	@Query(nativeQuery = true, value = "select name from employee where name Like")
//	Employee searchForEmployee();
	
}

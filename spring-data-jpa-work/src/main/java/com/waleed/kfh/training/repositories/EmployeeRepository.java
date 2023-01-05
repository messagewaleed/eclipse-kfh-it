package com.waleed.kfh.training.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waleed.kfh.training.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

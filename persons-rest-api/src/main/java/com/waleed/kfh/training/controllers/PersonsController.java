package com.waleed.kfh.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waleed.kfh.training.dto.Person;
import com.waleed.kfh.training.services.PersonsService;

@RestController
@RequestMapping("/api")
public class PersonsController {
	
	@Autowired
	PersonsService service;

	@GetMapping("/persons")
	List<Person> getAllPersons(){
		return service.getAllPersons();
	}
	
	@GetMapping("/persons/{id}")
	Person getPersonDetailsById(@PathVariable Integer id) {
		return service.getPersonDetailsById(id);
	}
	
	
	@PostMapping("/persons")
	void addNewPerson(@RequestBody Person person) {
		service.addNewPerson(person);
	}
	
	@PutMapping("/persons/{id}")
	void updatePersonDetails(@PathVariable Integer id,@RequestBody Person person) {
		service.updatePersonDetails(id, person);
	}
	
	
	@DeleteMapping("/persons/{id}")
	void deletePersonDetails(@PathVariable Integer id) {
		service.deletePersonDetails(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

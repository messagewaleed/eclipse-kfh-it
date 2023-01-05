package com.waleed.kfh.training.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.waleed.kfh.training.dto.Person;

@Service
public class PersonsService {
	
	

	List<Person> listOfPersons = new ArrayList<>(Arrays.asList(
			new Person(23, "Omar", "Kuwait"),
			new Person(217, "Sunder", "India"),
			new Person(1191, "Sana", "UAE"),
			new Person(342, "Dalal", "Kuwait City, Kuwait")
			));
	
//	This method returns a Person among the list by id
	private Person getPersonById(Integer id) {
		return listOfPersons.stream().filter(ref -> ref.id().equals(id)).findFirst().get();
	}
	
//	Get all the persons
	public List<Person> getAllPersons() {
		return listOfPersons;
	}
	
//	Gets the person details by id
	public Person getPersonDetailsById(Integer id) {
		Person person = getPersonById(id);
		return person;	
	}


	
//	Add a new Person
	public void addNewPerson(Person person) {
		listOfPersons.add(person);
	}
	
//	Update Person details by id
	public void updatePersonDetails(Integer id, Person person) {
		listOfPersons.set(listOfPersons.indexOf(getPersonById(id)), person);
	}

//	Delete Person details by id
	public void deletePersonDetails(Integer id) {
		listOfPersons.remove(listOfPersons.indexOf(getPersonById(id)));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

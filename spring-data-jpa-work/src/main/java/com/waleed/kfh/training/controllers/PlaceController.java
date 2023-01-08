package com.waleed.kfh.training.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.waleed.kfh.training.entities.Employee;
import com.waleed.kfh.training.entities.Place;
import com.waleed.kfh.training.services.PlaceService;

@RestController
public class PlaceController {

	@Autowired
	PlaceService service;
	
	@GetMapping("/places/employees/{employeeId}")
	List<Place> getAllPlacesByEmployeeId(@PathVariable Integer employeeId){
		return service.getAllPlacesByEmployeeId(employeeId);
	}
	
	@GetMapping("/places/{placeId}")
	Optional<Place> getPlaceById(@PathVariable Integer placeId){
		return service.getPlaceById(placeId);
	}
	
	@PostMapping("/places/employees/{employeeId}")
	void addNewPlace(@RequestBody Place place, @PathVariable Integer employeeId) {
		
		place.setEmployee(new Employee(employeeId, "", ""));
		
		service.addNewPlace(place);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

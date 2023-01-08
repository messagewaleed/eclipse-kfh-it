package com.waleed.kfh.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waleed.kfh.training.entities.Place;
import com.waleed.kfh.training.repositories.PlaceRepository;

@Service
public class PlaceService {

	@Autowired
	PlaceRepository repo;
	
	
	public List<Place> getAllPlacesByEmployeeId(Integer employeeId) {
		return repo.findByEmployeeId(employeeId);
	}
	
	public Optional<Place> getPlaceById(Integer placeId) {
		return repo.findById(placeId);
	}
	
	
	public void addNewPlace(Place place) {
		repo.save(place);
	}
	
	public void updatePlace(Place place) {
		repo.save(place);
	}
	
	public void deletePlace(Integer placeId) {
		repo.deleteById(placeId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

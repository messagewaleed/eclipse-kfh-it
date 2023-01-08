package com.waleed.kfh.training.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waleed.kfh.training.entities.Place;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Integer> {

	List<Place> findByEmployeeId(Integer id);
}

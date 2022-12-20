package com.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rating.entities.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

	List<Rating> findByUserId(String Id);
	
	List<Rating> findByHotelId(String Id);
	
}

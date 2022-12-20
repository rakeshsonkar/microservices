package com.rating.services;

import java.util.List;

import com.rating.entities.Rating;

public interface RatingService {

	// Create Rating 
	Rating createRating(Rating rating);
	
	//getAll Rating 
	List<Rating> getAllRating();
	
	
	//GetRating  By User 
	List<Rating> getAllRatingByUser(String userId); 
	
	//GetRating  By Hotel 
		List<Rating> getAllRatingByHotel(String hotelId);
}

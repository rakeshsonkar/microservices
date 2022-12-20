package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entities.Rating;
import com.rating.services.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating() {

		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
	}

	@GetMapping("/getByUser/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingByUser(@PathVariable String userId) {

		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatingByUser(userId));
	}

	@GetMapping("/getByHotel/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingByHotel(@PathVariable String hotelId) {

		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatingByHotel(hotelId));
	}

}

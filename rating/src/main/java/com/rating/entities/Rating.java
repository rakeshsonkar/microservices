package com.rating.entities;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@
public class Rating {

	@Id
	private String ratingId;

	private String userId;

	private String hotelId;

	private int rating;

	private String feedBack;
}

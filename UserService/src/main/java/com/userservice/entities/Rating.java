package com.userservice.entities;

import lombok.Data;

@Data
public class Rating {

	private String ratingId;
	
	private String userId;
	
	private String hotelId;
	
	private Integer rating;
	
	private String feedBack;
}

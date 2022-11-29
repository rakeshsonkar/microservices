package com.rating.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Rating_Micro")
public class Rating {

	@Id
	private String ratingId;

	private String userId;

	private String hotelId;

	private int rating;

	private String feedBack;
}

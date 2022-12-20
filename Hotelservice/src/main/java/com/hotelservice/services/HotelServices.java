package com.hotelservice.services;

import java.util.List;

import com.hotelservice.entities.Hotel;

public interface HotelServices {

	Hotel createHotel(Hotel hotel);

	List<Hotel> getAll();

	Hotel getSingleHotel(String id);

	Hotel deleteSingleHotel(String id);

	Void deleteAllHotel();
	
	Hotel updateHotel(Hotel hotel); 
}

package com.hotelservice.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entities.Hotel;
import com.hotelservice.execption.ResourseNotFoundExeption;
import com.hotelservice.repository.HotelRepository;

@Service
public class HotelServicesImpl implements HotelServices {
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {

		return hotelRepository.findAll();
	}

	@Override
	public Hotel getSingleHotel(String id) {

		return hotelRepository.findById(id)
				.orElseThrow(() -> new ResourseNotFoundExeption("Hotel not found by Id !!! "));
	}

	@Override
	public Hotel deleteSingleHotel(String id) {
		hotelRepository.deleteById(id);
		return null;
	}

	@Override
	public Void deleteAllHotel() {
		hotelRepository.deleteAll();
		return null;
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		Hotel h = hotelRepository.findById(hotel.getId())
				.orElseThrow(() -> new ResourseNotFoundExeption("Hotel not found by Id !!! "));

		h.setAbout(hotel.getAbout());
		h.setLocation(hotel.getLocation());
		h.setName(hotel.getName());
		hotelRepository.save(h);

		return h;
	}

}

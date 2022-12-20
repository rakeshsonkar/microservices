package com.hotelservice.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelservice.entities.Hotel;
import com.hotelservice.execption.ResourseNotFoundExeption;
import com.hotelservice.services.HotelServices;

@RestController
@RequestMapping("/hotel")
public class HotelCotroller {

	@Autowired
	private HotelServices hotelServices;

	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {

		return ResponseEntity.status(HttpStatus.CREATED).body(hotelServices.createHotel(hotel));
	}

	@GetMapping
	public ResponseEntity<List<Hotel>> getAll() {

		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String id) {

		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.getSingleHotel(id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Hotel> deleteSingleHotel(@PathVariable String id) {
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.deleteSingleHotel(id));
	}

	@DeleteMapping
	public ResponseEntity deleteAllHotel() {
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.deleteAllHotel());
	}

	@PutMapping
	public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
		return ResponseEntity.status(HttpStatus.OK).body(hotelServices.updateHotel(hotel));
	}
}

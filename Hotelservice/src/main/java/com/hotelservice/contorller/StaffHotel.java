package com.hotelservice.contorller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class StaffHotel {
	
	@GetMapping
	public ResponseEntity<List<String>> getStaffs(){
		List<String> list = Arrays.asList("Ram","shyam","sita","Krishna");
		return new ResponseEntity<>(list,HttpStatus.OK);
	}

}

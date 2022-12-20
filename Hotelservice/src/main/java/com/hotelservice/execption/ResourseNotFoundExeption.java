package com.hotelservice.execption;

public class ResourseNotFoundExeption extends RuntimeException {
	public ResourseNotFoundExeption() {
		super("Resourse Not found !!!!!!!!!!!");
	}
	
	public ResourseNotFoundExeption(String message) {
		super(message);
	}

}

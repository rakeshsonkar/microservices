package com.userservice.services;

import java.util.List;

import com.userservice.entities.User;

public interface UserService {
	//create update 
	User create(User user);
	
	List<User> getAllUser();
	
	User getSingleUser(String UserId);
	
	User deleteUser(String UserId);
	
	User updateUser(String UserId);
}

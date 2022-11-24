package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entities.User;
import com.userservice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//createUser 
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User user1=userService.create(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
		
	}
	
	// getSingleUser 
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		User user=userService.getSingleUser(userId);
		return ResponseEntity.ok(user);
	}
	
	//getAllUser
	@GetMapping
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser=userService.getAllUser();
		return ResponseEntity.ok(allUser);
		}
	
	// getSingleUser 
		@DeleteMapping("/{userId}")
		public ResponseEntity<User> deleteUser(@PathVariable String userId){
			User user=userService.deleteUser(userId);
			return ResponseEntity.ok(user);
		}
	

}

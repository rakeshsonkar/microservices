package com.userservice.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.entities.User;
import com.userservice.exceptions.ResourceNotFoundException;
import com.userservice.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
 
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User create(User user) {
		String userId = UUID.randomUUID().toString();
		user.setUserId(userId);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
	
		return userRepository.findAll();
	}

	@Override
	public User getSingleUser(String userId) {
		return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given id is not found on server !! :  "+userId));
	}

	@Override
	public User deleteUser(String UserId) {
		// TODO Auto-generated method stub

		 userRepository.deleteById(UserId);
		return null;
		
	}

	@Override
	public User updateUser(String UserId) {
		// TODO Auto-generated method stub
		return null;
	}

}

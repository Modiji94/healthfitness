package com.example.medicalfitness.services;

import java.util.List;

import com.example.medicalfitness.entity.User;

public interface UserService {

	public List<User>getalluser();
	
	
	User signUpUser(User user);
	
	User authenticateUser(String email,String password);
		
	User getUserByID(int id);
	
	User deleteById(int userId);
	
	User checkUserByEmail(String email);


}

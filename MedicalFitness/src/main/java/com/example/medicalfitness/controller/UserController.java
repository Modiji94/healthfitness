package com.example.medicalfitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalfitness.entity.User;
import com.example.medicalfitness.services.UserService;
import com.example.medicalfitness.services.UserServiceImpl;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:3000")


public class UserController {
	
	@Autowired
  public  UserService  service;


	@GetMapping
public List<User> getalluser(){
	return  service.getalluser();
		
}
	
@PostMapping("/adduser")
public ResponseEntity<User>adduser(@RequestBody User usernew){
		
		System.out.println(usernew);
		if(usernew!=null)
		return new ResponseEntity<>(service.signUpUser(usernew),HttpStatus.CREATED);
		
		else
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);

	}

@Transactional
@PostMapping("/authenticate")
public  ResponseEntity<User>authenticateUser(@RequestBody  @Validated User request) {
	
	request.getEmailid();
	request.getPassword();
	return new ResponseEntity<User>(service.authenticateUser(request.getEmailid(),request.getPassword()),HttpStatus.ACCEPTED);
}

@Transactional
@PostMapping("/getuserbyid/{id}")
public ResponseEntity<User>getuserbyid(@PathVariable int id, @RequestBody int userId){
	return new ResponseEntity<User>(service.getUserByID(userId),HttpStatus.FOUND);
}


@Transactional
@DeleteMapping("/delete/{id}")
public ResponseEntity<User> deleteById(int userId) {
	return new ResponseEntity<User>(service.deleteById(userId),HttpStatus.OK);
}


//@PostMapping("/getuserbyemail/{email}")
// public ResponseEntity<User>getuserbyemail(@PathVariable String email){
//	
//}

@PostMapping("/checkUser/{email}")
public ResponseEntity<User> checkUserByEmail(@PathVariable String email) {
	if(service.checkUserByEmail(email)!=null) {
		return new ResponseEntity<User>(service.checkUserByEmail(email),HttpStatus.OK);
	}
	return null;
}

}

package com.example.medicalfitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.medicalfitness.dao.UserRepository;
import com.example.medicalfitness.entity.Health;
import com.example.medicalfitness.services.HealthServices;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/health")
@CrossOrigin(origins="http://localhost:3000")

public class HealthController {
	
	@Autowired
 private  HealthServices service;
	
	@Autowired
	private  UserRepository user;
	
	@GetMapping("/performRegularHealthCheckup/{id}/{age}")
	public ResponseEntity<List<Health>> performRegularHealthCheckup(@PathVariable int id,int age) {
		
		 return new ResponseEntity<List<Health>>(service.performRegularHealthCheckup(id,age),HttpStatus.OK);
//		 return new ResponseEntity<>(service.signUpUser(usernew),HttpStatus.CREATED);
	}
	
	@PostMapping("/addhealth/{id}/{age}")
public ResponseEntity<Health>addhealth(@RequestBody Health health ){
	return new ResponseEntity<Health>(service.addhealth(health),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/provideNutritionGuidance/{id}/{age}")
	public ResponseEntity<List<Health>> provideNutritionGuidance(@PathVariable int id,int age) {
		
		return new ResponseEntity<List<Health>>(service.provideNutritionGuidance(id,age),HttpStatus.OK);
	}

	@GetMapping("/encouragePhysicalActivity/{id}/{age}")
	public ResponseEntity<?> encouragePhysicalActivity(@PathVariable int id,int age) {
		
		return new ResponseEntity<List<Health>>(service.encouragePhysicalActivity(id,age),HttpStatus.OK);
	}

}

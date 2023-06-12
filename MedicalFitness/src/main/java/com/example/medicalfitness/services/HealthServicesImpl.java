package com.example.medicalfitness.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.medicalfitness.dao.HealthRepository;
import com.example.medicalfitness.dao.UserRepository;
import com.example.medicalfitness.entity.Health;
import com.example.medicalfitness.entity.User;
import com.example.medicalfitness.exception.CustomeException;

@Service
public class HealthServicesImpl implements HealthServices{

	@Autowired
	private HealthRepository health;
	
	
	@Autowired
	public  UserService  service;
	
	@Override
	public List<Health> performRegularHealthCheckup(int id ,int age) {
		User u=service.getUserByID(id);
		if(u!=null && u.getAge()>=65) {
			List<Health>list=health.performRegularHealthCheckup(id);
			return list;
		}		
	 throw new  CustomeException("invalid id is given");
	}
	

	@Override
	public List<Health> provideNutritionGuidance(int id ,int age) {
		User u=service.getUserByID(id);
		if(u!=null && u.getAge()>=65) {
			List<Health>list=health.provideNutritionGuidance(id);
			return list;
		}	
	 throw new  CustomeException("invalid id is given");
	}
	

	@Override
	public List<Health> encouragePhysicalActivity(int id ,int age) {
		User u=service.getUserByID(id);
		if(u!=null && u.getAge()>=65) {
			List<Health>list=health.encouragePhysicalActivity(id);
			return list;
		}		
	 throw new  CustomeException("invalid id is given");
	}


	@Override
	public Health addhealth(Health health1) {

		User u=service.getUserByID(health1.getId());
		if(u!=null && u.getAge()>=65) {
			return health.save(health1);		
		}
		 throw new  CustomeException("invalid id is given");
	}
	
}

	


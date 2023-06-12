package com.example.medicalfitness.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.medicalfitness.entity.Health;

public interface HealthServices{

	    public List<Health> performRegularHealthCheckup(int id,int age) ;

	    public List<Health> provideNutritionGuidance(int id,int age) ;

	    public List<Health> encouragePhysicalActivity(int id,int age) ;

		public Health addhealth(Health health);



	
	






}

package com.example.medicalfitness.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.medicalfitness.entity.Health;

@Repository
@EnableJpaRepositories

public interface HealthRepository extends JpaRepository<Health,Integer>{

	public List<Health> performRegularHealthCheckup(int id);

	public List<Health> provideNutritionGuidance(int id) ;

	public List<Health> encouragePhysicalActivity(int id); 
	 
	
	
}

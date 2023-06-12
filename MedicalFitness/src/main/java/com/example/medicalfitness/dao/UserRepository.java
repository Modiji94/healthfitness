package com.example.medicalfitness.dao;


import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.medicalfitness.entity.User;

@SuppressAjWarnings
@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User,Integer>{
	
	public User findbyEmailandPassword(String email,String password);
		   
	public User findbyEmail(String email);

}

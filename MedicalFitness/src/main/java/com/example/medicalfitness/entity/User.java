package com.example.medicalfitness.entity;

import java.util.List;

import com.example.medicalfitness.entity.Adddress.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
public class User extends BaseEntity{

@Column	
	private String firstname;
@Column	
	private String lastname;
@Column		
	private String emailid;
@Column	
	private String password;
@Column		
	private int mobileno;
@Column
private int age;

	

	
@OneToOne(cascade =CascadeType.ALL)
//@JsonIgnoreProperties("user")
Address address;


	
}

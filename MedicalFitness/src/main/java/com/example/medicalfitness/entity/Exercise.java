package com.example.medicalfitness.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Exercise extends Health{

	@Column
	private String walk;
	
	@Column
	private  String  socialactivity;
	
	@Column
	private String yoga;
	
	@Column
	private String meditation;
	
	 
}

package com.example.medicalfitness.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Health extends BaseEntity{

	@Column
	private int heartbeat;
	
	@Column
	private int bloodpressure;
	
	@Column
	private List<RegularCheckup>regularcheckup;
	
	@Column
	private Exercise exercise;
	
	@Column
	private BalancedDiet balanceddiet;
	
	
	
	
	
	
	
}

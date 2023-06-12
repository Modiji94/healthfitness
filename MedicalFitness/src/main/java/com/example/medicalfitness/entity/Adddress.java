package com.example.medicalfitness.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Adddress  extends BaseEntity{

	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	@Setter
	//@ToString
	@Table(name="address_table")
	@Entity
	public class Address extends BaseEntity {
		@Column
		private String addressLine1;
		
		@Column
		private String addressLine2;
		
		@Column
		private String city;
		
		@Column
		private String state;
		
		@Column
		private int pincode;
		

		@OneToOne(mappedBy="address")
		@JsonIgnoreProperties("address")
		private User user;
	}
}

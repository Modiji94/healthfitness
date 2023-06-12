package com.example.medicalfitness.dto;

import com.example.medicalfitness.entity.User;

public class Logindto {

	private  User email;
	private  User password;
	
	public Logindto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Logindto(User email, User password) {
		super();
		this.email = email;
		this.password = password;
	}

	public User getEmail() {
		return email;
	}

	public void setEmail(User email) {
		this.email = email;
	}

	public User getPassword() {
		return password;
	}

	public void setPassword(User password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Logindto [email=" + email + ", password=" + password + "]";
	}
	
	
	
}

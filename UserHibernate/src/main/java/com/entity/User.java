package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class User {
	
	
	@Id
	private int id;
	
    private String username;
	
	private String password;
	
	private String email;
	
	private String gender;
	
	private String dob;
	
	private float mobileNo;
	
	private String address;
	
	private int age;

	
	
	public User(int id, String username, String password, String email, String gender, String dob, float mobileNo,
			String address, int age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.mobileNo = mobileNo;
		this.address = address;
		this.age = age;
	}
	
}

	

package com.capgemini.java.web;

public class Person {
	private int id;
	private String name, lastname, address, gender, job, experience;
	
	public Person() {
		
	}
	
	public Person(String name, String lastname, String address, String gender, String job, String experience) {
		this.id=0;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.gender = gender;
		this.job = job;
		this.experience = experience;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	

}

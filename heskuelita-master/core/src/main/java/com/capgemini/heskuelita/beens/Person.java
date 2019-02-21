package com.capgemini.heskuelita.beens;

import java.util.*;

public class Person {

	private String name;
	private String last_name;
	private int Id;
	private Date time;
	private char gender;
	private int phone;

		//Constructor
	public Person(String name, String last_name, int id, Date time, char gender, int phone) {
		this.name = name;
		this.last_name = last_name;
		this.Id = id;
		this.time = time;
		this.gender = gender;
		this.phone = phone;
	}
	
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}

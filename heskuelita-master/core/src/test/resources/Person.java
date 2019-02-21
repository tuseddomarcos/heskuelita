package com.capgemini.heskuelita.beans;

public class Person {
	private String name;
	private String lastName;
	private int id; 
		
	public Person() {};
		
	public Person(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	};
	
	public String getLastName() {
		return this.lastName;
	};
	
	public int getId() {
		return this.id;
	};
}

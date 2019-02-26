package com.capgemini.heskuelita.beans;

public class Teacher extends Person {
	
	public Teacher () {
		super();
	}
	
	public Teacher (int id, String name, String lastName,String gender,int age, String doc_type, int identification, int phone, String email) {
		
		super(id, name, lastName, gender, age, doc_type, identification, phone, email);
	}
				
}

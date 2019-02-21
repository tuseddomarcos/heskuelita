package com.capgemini.heskuelita.beans;

public class Student extends Person {
	
	private short id;
	private String doc_type;
	private int identification;
	private int phone;

	
	public Student () {
	
	
}	
	public Student (String name, String lastName,String gender,short age) {
		super (name, lastName, gender, age);
		}
		
				
	public Teacher (short id, String doc_type, int identification, int phone) {
		this.id = id;
		this.doc_type = doc_type;
		this.identification = identification;
		this.phone = phone;
	}
	
}

package com.capgemini.heskuelita.beans;

public class Teacher extends Person {
	
	private short id;
	private String doc_type;
	private int identification;
	private int phone;
	
	public Teacher (String name, String lastName,String gender,short age) {
		super (name, lastName, gender, age);
		
				}
	
	public Teacher (short id, String doc_type, int identification, int phone) {
		this.id = id;
		this.doc_type = doc_type;
		this.identification = identification;
		this.phone = phone;
	}
	
	
	
	
}

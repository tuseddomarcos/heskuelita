package com.capgemini.heskuelita.beans;

public class Professor extends Person {
	
	public Professor() {
		super();
	}
	
	public Professor(int idProf, String name, String lastName, int dni, /*Date birthdate,*/ String address, char gender) {
		super(idProf, name, lastName, dni, /*birthdate,*/ address, gender);
	}

}

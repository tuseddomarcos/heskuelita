package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Professor extends Person {
	
	private int idProf;
	private String address;
	
	public Professor(int idProf, String name, String lastName, int dni, Date birthdate, String address, char gender) {
		super(name, lastName, dni, birthdate, gender);
		
		this.idProf = idProf;
		this.address = address;
	}

	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

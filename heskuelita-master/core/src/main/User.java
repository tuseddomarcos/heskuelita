package com.capgemini.heskuelita.beens;

public class User {
	
	private int id_Usuario;
	private String email;
	private String pasword;

		//Constructor
	
	public User() {
		
	}
	public User(int id_Usuario, String email, String pasword) {
		this.id_Usuario = id_Usuario;
		this.email = email;
		this.pasword = pasword;
	}
	
	//Getters and Setters

	public int getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(int id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	
	
	
}

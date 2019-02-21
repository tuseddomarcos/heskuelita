package com.capgemini.heskuelita.beans;

public class User {
	private int id;
	private String neme_user, password;
	public User(int id, String name_user, String password) {
		this.id=id;
		this.neme_user=name_user;
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNeme_user() {
		return neme_user;
	}
	public void setNeme_user(String neme_user) {
		this.neme_user = neme_user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

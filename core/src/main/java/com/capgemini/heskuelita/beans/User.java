package com.capgemini.heskuelita.beans;

public class User extends Component {

	//Declaration of User atributes
	private String user;
	private String password;
	
	//Getters and Setters: user
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	//Getters and Setters: password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Constructor without atributes
	public User () {
		super ();
	}
	
	// Constructor ALL User atributes 
	public User (long id, String user, String password) {
		super(id);
		this.user = user;
		this.password = password;
	}
	
}

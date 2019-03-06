package com.capgemini.heskuelita.beans;

public abstract class Component {
	
	private int id;
	
	public Component() {
		
	}
	
	public Component(int id) {
		this.id = id;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

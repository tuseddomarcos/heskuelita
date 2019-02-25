package com.capgemini.heskuelita.beans;

public class Room {

	private String name;
	private int capacity;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public String toString () {
		return name;
	}
}
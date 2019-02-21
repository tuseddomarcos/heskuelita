package com.capgemini.heskuelita.beans;

public class Classroom {
	
	private int idClassroom;
	private String nameClassroom;
	private short capacity;
	
	public Classroom(int idClassroom, String nameClassroom, short capacity) {
		this.idClassroom = idClassroom;
		this.nameClassroom = nameClassroom;
		this.capacity = capacity;
	}
	
	
	public int getIdClassroom() {
		return idClassroom;
	}

	public void setIdClassroom(int idClassroom) {
		this.idClassroom = idClassroom;
	}

	public String getNameClassroom() {
		return nameClassroom;
	}

	public void setNameClassroom(String nameClassroom) {
		this.nameClassroom = nameClassroom;
	}

	public short getCapacity() {
		return capacity;
	}

	public void setCapacity(short capacity) {
		this.capacity = capacity;
	}
	
	
}

package com.capgemini.heskuelita.beans;

public class Classroom extends Component {
	
	private String nameClassroom;
	private short capacity;
	
	public Classroom() {
		super();
	}
	
	public Classroom(long idClassroom, String nameClassroom, short capacity) {
		super(idClassroom);
		this.nameClassroom = nameClassroom;
		this.capacity = capacity;
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

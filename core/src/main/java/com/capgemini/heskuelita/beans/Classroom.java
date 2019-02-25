package com.capgemini.heskuelita.beans;

public class Classroom extends Component {

	//Declaration of Classroom atributes
	private int roomNumber;
	private short floor;
	
	// Getters and Setters: Classroom
	public int GetClassroom() {
		return roomNumber;
	}
	public void SetClassroom(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	// Getters and Setters: Floor
	public short GetFloor() {
		return floor;
	}
	public void SetFloor(short floor) {
		this.floor = floor;
	}

	//Constructor without atributes
	public Classroom () {
		super();
	}
	
	// Constructor ALL Professor atributes 
	public Classroom (long id, int roomNumber, short floor) {
		super(id);
		this.roomNumber = roomNumber;
		this.floor = floor;
	}
	
}

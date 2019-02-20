package com.capgemini.heskuelita.beans;

public class Room {
	private int idRoom;
	private int capacity;
	
	public Room() {};
	
	public Room(int idRoom, int capacity) {
		this.idRoom = (idRoom);
		this.capacity = capacity;
	}

	public int getIdRoom() {
		return idRoom;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
}

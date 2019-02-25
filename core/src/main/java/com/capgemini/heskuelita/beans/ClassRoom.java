package com.capgemini.heskuelita.beans;

public class ClassRoom extends IDComponent {

	private String room_addr;
	
	
	public ClassRoom() {super ();}
	
	public ClassRoom(Long pID, String pRoom_addr) {
		
		super (pID);
		this.room_addr=pRoom_addr;
		
	}

	public String getRoom_addr() {
		return room_addr;
	}

	public void setRoom_addr(String room_addr) {
		this.room_addr = room_addr;
	}
	
	
	
}

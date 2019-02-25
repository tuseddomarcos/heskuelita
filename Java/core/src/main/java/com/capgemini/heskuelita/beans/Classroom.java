package com.capgemini.heskuelita.beans;

public class Classroom {
	
	private int classroomNum;
	private String address, building;
	
	public Classroom(int classroomNum, String address, String building) {
		this.classroomNum = classroomNum;
		this.address = address;
		this.building = building;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getClassroomNum() {
		return classroomNum;
	}

	public void setClassroomNum(int classroomNum) {
		this.classroomNum = classroomNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

}

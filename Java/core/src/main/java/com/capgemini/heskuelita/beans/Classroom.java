package com.capgemini.heskuelita.beans;

public class Classroom extends Component {
	
	private int classroomNum;
	private String address, building;
	
	public Classroom() {
		super();
	}
	
	public Classroom(int idClassroom, int classroomNum, String address, String building) {
		super(idClassroom);
		
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

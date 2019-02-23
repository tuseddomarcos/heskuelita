package com.capgemini.heskuelita.beans;

public class Classroom extends Component{
	
	private int classroomNumber;
	private int floor;
	
	public Classroom(int classroomNumber, int floor) {
		this.classroomNumber= classroomNumber;
		this.floor= floor;
	}

	public int getClassroomNumber() {
		return classroomNumber;
	}

	public void setClassroomNumber(int classroomNumber) {
		this.classroomNumber = classroomNumber;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	
}

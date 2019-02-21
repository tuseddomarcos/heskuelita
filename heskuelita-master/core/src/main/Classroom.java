package com.capgemini.heskuelita.beens;

public class Classroom {
	int id_Classroom;
	int Number_classroom;

	
	
			//Constructor
	public Classroom(int id_Classroom, int number_classroom) {
		this.id_Classroom = id_Classroom;
		Number_classroom = number_classroom;
	}

		
	
			//Getters and Setters
	public int getId_Classroom() {
		return id_Classroom;
	}


	public void setId_Classroom(int id_Classroom) {
		this.id_Classroom = id_Classroom;
	}


	public int getNumber_classroom() {
		return Number_classroom;
	}


	public void setNumber_classroom(int number_classroom) {
		Number_classroom = number_classroom;
	}




}

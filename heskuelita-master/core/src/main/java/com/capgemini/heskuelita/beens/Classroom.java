package com.capgemini.heskuelita.beens;

public class Classroom {

	private String name_classroom;
	private int capasity_clasrrom;
	
	//builders
	public Classroom() { }
	public Classroom(String name_classroom, int capasity_clasrrom) {
		super();
		this.name_classroom = name_classroom;
		this.capasity_clasrrom = capasity_clasrrom;
	}
	//Getters and Setters
	public String getName_classroom() {
		return name_classroom;
	}
	public void setName_classroom(String name_classroom) {
		this.name_classroom = name_classroom;
	}
	public int getCapasity_clasrrom() {
		return capasity_clasrrom;
	}
	public void setCapasity_clasrrom(int capasity_clasrrom) {
		this.capasity_clasrrom = capasity_clasrrom;
	}


	
	
	
}
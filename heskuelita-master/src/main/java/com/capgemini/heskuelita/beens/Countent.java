package com.capgemini.heskuelita.beens;

public class Countent {
	
	private int id_Countent;
	private String name_Countent;
	private int Time_Duration;
	
	// Constructor
	public Countent(int id_Countent, String name_Countent, int time_Duration) {
		this.id_Countent = id_Countent;
		this.name_Countent = name_Countent;
		Time_Duration = time_Duration;
	}
	
	// Getters and Setters

	public int getId_Countent() {
		return id_Countent;
	}

	public void setId_Countent(int id_Countent) {
		this.id_Countent = id_Countent;
	}

	public String getName_Countent() {
		return name_Countent;
	}

	public void setName_Countent(String name_Countent) {
		this.name_Countent = name_Countent;
	}

	public int getTime_Duration() {
		return Time_Duration;
	}

	public void setTime_Duration(int time_Duration) {
		Time_Duration = time_Duration;
	}
	
	

}

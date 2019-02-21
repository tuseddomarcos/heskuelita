package com.capgemini.heskuelita.beens;

public class Course {
	
	private int Id_Course;
	private String Name_Course;
	private int Time_Duration;
	private int Limit_Person;
	
	//Constructor
	
	public Course(int id_Course, String name_Course, int time_Duration, int limit_Person) {
		super();
		Id_Course = id_Course;
		Name_Course = name_Course;
		Time_Duration = time_Duration;
		Limit_Person = limit_Person;
	}
		
		//Getters and Setters
	
	public int getId_Course() {
		return Id_Course;
	}

	public void setId_Course(int id_Course) {
		Id_Course = id_Course;
	}

	public String getName_Course() {
		return Name_Course;
	}

	public void setName_Course(String name_Course) {
		Name_Course = name_Course;
	}

	public int getTime_Duration() {
		return Time_Duration;
	}

	public void setTime_Duration(int time_Duration) {
		Time_Duration = time_Duration;
	}

	public int getLimit_Person() {
		return Limit_Person;
	}

	public void setLimit_Person(int limit_Person) {
		Limit_Person = limit_Person;
	}
	
	
	

}

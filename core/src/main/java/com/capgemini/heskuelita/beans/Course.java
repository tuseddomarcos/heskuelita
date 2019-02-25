package com.capgemini.heskuelita.beans;
import java.util.*;

public class Course extends IDGenerator {

	private String name;
	private String description;
	private Date duration;
	private int limitPerson;
	private List <Student> studentsList;
	private List <String> studentsUserList;
	
	public void addStudent(Student student) {
		studentsList.add(student);
		studentsUserList.add(student.getUser());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public int getLimitPerson() {
		return limitPerson;
	}
	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}

	@Override
	public String toString() {
		return name;
	}	
	
	public int countStudentsInscripted() {
		return studentsList.size();
	}
}
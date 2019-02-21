package com.capgemini.heskuelita.beans;
import java.util.Date;

public class Course {

	private int id;
	private String name;
	private String description;
	private Date duration;
	private int limitPerson;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
}
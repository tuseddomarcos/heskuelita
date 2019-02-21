package com.capgemini.heskuelita.beans;

import java.util.HashMap;
import java.util.Map;
//import org.joda.time.LocalTime;

public class Course {

	private String name;
	private String description;
	private int duration;
	private int limitPerson;
	private Map<String, String> content= new HashMap<String, String>();
	
	//si es que usamos joda time con maven
	//private Collection<LocalTime> offers;
	
	public Course(String name, String description, int duration, int limitPerson){
		this.name= name;
		this.description= description;
		this.duration= duration;
		this.limitPerson= limitPerson;
		
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(int limitPerson) {
		this.limitPerson = limitPerson;
	}

	public Map<String, String> getContent() {
		return content;
	}

	public void setContent(Map<String, String> content) {
		this.content = content;
	}
}

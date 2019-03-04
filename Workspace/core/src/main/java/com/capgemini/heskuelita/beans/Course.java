package com.capgemini.heskuelita.beans;

public class Course extends Component {
	
	private String nameCourse;
	private String description;
	private short duration;
	private short limitPerson;
	
	public Course() {
		super();
	}
	
	public Course(long idCourse, String nameCourse, String description, int duration, int limitPerson ) {
		super(idCourse);
		this.nameCourse = nameCourse;
		this.description = description;
		this.duration = (short)duration;
		this.limitPerson = (short)limitPerson;
	}
	
	
	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getDuration() {
		return duration;
	}

	public void setDuration(short duration) {
		this.duration = duration;
	}

	public short getLimitPerson() {
		return limitPerson;
	}

	public void setLimitPerson(short limitPerson) {
		this.limitPerson = limitPerson;
	}
	
}




package com.capgemini.heskuelita.beans;

public class Course {
	
	private int idCou, duration, limitPerson, idProf;
	private String nameCou, descriptionCou;
	
	public Course(int idCou, String nameCou, String descriptionCou, int duration, int limitPerson, int idProf) {
		this.idCou = idCou;
		this.nameCou = nameCou;
		this.descriptionCou = descriptionCou;
		this.duration = duration;
		this.limitPerson = limitPerson;
		this.idProf = idProf;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getIdCou() {
		return idCou;
	}

	public void setIdCou(int idCou) {
		this.idCou = idCou;
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

	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
	}

	public String getNameCou() {
		return nameCou;
	}

	public void setNameCou(String nameCou) {
		this.nameCou = nameCou;
	}

	public String getDescriptionCou() {
		return descriptionCou;
	}

	public void setDescription(String description) {
		this.descriptionCou = description;
	}

}

package com.capgemini.heskuelita.beans;

public class Course extends Component {
	
	private int duration, limitPerson, idProf;
	private String nameCou, descriptionCou;
	
	public Course() {
		super();
	}
	
	public Course(int idCou, String nameCou, String descriptionCou, int duration, int limitPerson, int idProf) {
		super(idCou);
		
		this.nameCou = nameCou;
		this.descriptionCou = descriptionCou;
		this.duration = duration;
		this.limitPerson = limitPerson;
		this.idProf = idProf;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
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

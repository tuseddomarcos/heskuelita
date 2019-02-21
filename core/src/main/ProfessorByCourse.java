package com.capgemini.heskuelita.beans;

public class ProfessorByCourse {
	
	private int idCou, idProf;
	private String nameCou, descriptionCou, professor;
	
	public ProfessorByCourse(int idCou, int idProf, String nameCou, String descriptionCou, String professor) {
		super();
		this.idCou = idCou;
		this.idProf = idProf;
		this.nameCou = nameCou;
		this.descriptionCou = descriptionCou;
		this.professor = professor;
	}
	
	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getIdCou() {
		return idCou;
	}

	public void setIdCou(int idCou) {
		this.idCou = idCou;
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

	public void setDescriptionCou(String descriptionCou) {
		this.descriptionCou = descriptionCou;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}

package com.capgemini.heskuelita.beans;

public class Content {

	private int idCont, idCou;
	private String nameCont, descriptionCont;
	
	public Content(int idCont, int idCou, String nameCont, String descriptionCont) {
		this.idCont = idCont;
		this.idCou = idCou;
		this.nameCont = nameCont;
		this.descriptionCont = descriptionCont;
	}
	

	// GETTERS AND SETTERS ----------------------------------------------------
	public int getIdCont() {
		return idCont;
	}

	public void setIdCont(int idCont) {
		this.idCont = idCont;
	}

	public int getIdCou() {
		return idCou;
	}

	public void setIdCou(int idCou) {
		this.idCou = idCou;
	}

	public String getNameCont() {
		return nameCont;
	}

	public void setNameCont(String nameCont) {
		this.nameCont = nameCont;
	}

	public String getDescriptionCont() {
		return descriptionCont;
	}

	public void setDescriptionCont(String descriptionCont) {
		this.descriptionCont = descriptionCont;
	}
		
}

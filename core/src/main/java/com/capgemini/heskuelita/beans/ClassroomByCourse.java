package com.capgemini.heskuelita.beans;

public class ClassroomByCourse {
	
	private int idCbc, idCou, classroomNum;
	private String nameCou, classroomAddress;
	
	public ClassroomByCourse(int idCbc, int idCou, int classroomNum, String nameCou, String classroomAddress) {
		this.idCbc = idCbc;
		this.idCou = idCou;
		this.classroomNum = classroomNum;
		this.nameCou = nameCou;
		this.classroomAddress = classroomAddress;
	}

	
	// GETTERS AND SETTERS ----------------------------------------------------
	public int getIdCbc() {
		return idCbc;
	}

	public void setIdCbc(int idCbc) {
		this.idCbc = idCbc;
	}

	public int getIdCou() {
		return idCou;
	}

	public void setIdCou(int idCou) {
		this.idCou = idCou;
	}

	public int getClassroomNum() {
		return classroomNum;
	}

	public void setClassroomNum(int classroomNum) {
		this.classroomNum = classroomNum;
	}

	public String getNameCou() {
		return nameCou;
	}

	public void setNameCou(String nameCou) {
		this.nameCou = nameCou;
	}

	public String getClassroomAddress() {
		return classroomAddress;
	}

	public void setClassroomAddress(String classroomAddress) {
		this.classroomAddress = classroomAddress;
	}

}

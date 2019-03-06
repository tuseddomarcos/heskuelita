package com.capgemini.heskuelita.beans;

import java.util.Date;

public class AcademicOffer extends Component{
	
	private int idCou, classroomNum;
	private String nameCou, classroomAddress, professor, shift, days;
	private Date startDate;
	
	public AcademicOffer() {
		super();
	}
	
	public AcademicOffer(int idAo, int idCou, int classroomNum, String nameCou, String classroomAddress,
			String professor, String shift, String days, Date startDate) {
		super(idAo);
		
		this.idCou = idCou;
		this.classroomNum = classroomNum;
		this.nameCou = nameCou;
		this.classroomAddress = classroomAddress;
		this.professor = professor;
		this.shift = shift;
		this.days = days;
		this.startDate = startDate;
	}

	
	// GETTERS AND SETTERS ----------------------------------------------------
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

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}

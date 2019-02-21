package com.capgemini.heskuelita.beans;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Schedule {
	
	//Declaretion of Schedule atributes
	private int Id;
	private int IdCourse;
	private int IdProfessor;
	private int IdClassroom;
	private Date StartDate;
	private Date EndDate;
	private String Days;
	private TimeUnit StartHour= TimeUnit.DAYS;
	private TimeUnit EndHour= TimeUnit.DAYS;
	
	// Constructor id
	public int GetId() {
		return Id;
	}
	public void SetId(int Id) {
		this.Id = Id;
	}
	
	// Constructor idCourse
	public int GetIdCourse() {
		return IdCourse;
	}
	public void SetIdCourse(int IdCourse) {
		this.IdCourse = IdCourse;
	}
	
	// Constructor idProfessor
	public int GetIdProfessor() {
		return IdProfessor;
	}
	public void SetIdProfessor(int IdProfessor) {
		this.IdProfessor = IdProfessor;
	}
	
	// Constructor idClassroom
	public int GetIdClassroom() {
		return IdClassroom;
	}
	public void SetIdClassroom(int IdClassroom) {
		this.IdClassroom = IdClassroom;
	}
	
	// Constructor StartDate
	public Date GetStartDate() {
		return StartDate;
	}
	public void SetStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}
	
	// Constructor EndDate
	public Date GetEndDate() {
		return EndDate;
	}
	public void SetEndDate(Date EndDate) {
		this.EndDate = EndDate;
	}
	
	// Constructor Days
	public String GetDays() {
		return Days;
	}
	public void SetDays(String Days) {
		this.Days = Days;
	}
	
	// Constructor StartHour
	public TimeUnit GetStartHour() {
		return StartHour;
	}
	public void SetStartHour(TimeUnit StartHour) {
		this.StartHour = StartHour;
	}
	
	// Constructor EndHour
	public TimeUnit GetEndHour() {
		return EndHour;
	}
	public void SetEndHour(TimeUnit EndHour) {
		this.EndHour = EndHour;
	}
	
	
	// Constructor ALL Schedule atributes 
	public Schedule (int Id, int IdCourse, int IdProfessor, int IdClassroom, Date StartDate, Date EndDate, String Days, TimeUnit StartHour, TimeUnit EndHour) {
		this.Id= Id;
		this.IdCourse = IdClassroom;
		this.IdProfessor = IdProfessor;
		this.IdClassroom = IdClassroom;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		this.Days = Days;
		this.StartHour = StartHour;
		this.EndHour = EndHour;
	}
	
}

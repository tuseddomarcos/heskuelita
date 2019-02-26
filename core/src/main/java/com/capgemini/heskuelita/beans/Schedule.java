package com.capgemini.heskuelita.beans;

public class Schedule extends Component {

	private String days;
	private String shift;
	
	public Schedule () {
		super();
	}
	
	public Schedule (int id, String days, String shift) {
		
		super (id);
		this.days=days;
		this.shift=shift;
		
	}
	
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	
}

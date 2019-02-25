package com.capgemini.heskuelita.beans;

public class Course extends IDComponent {

	private String cou_name;
	private String cou_description;
	private int cou_duration;
	private int cou_limit;
	
	public Course () {

        super ();
    }
	
	public Course(Long pCou_ID, String pCou_name, String pCou_description, int pCou_duration, int pCou_limit) {
		
		
		super (pCou_ID);		
		this.cou_name=pCou_name;
		this.cou_description=pCou_description;
		this.cou_duration=pCou_duration;
		this.cou_limit=pCou_limit;
					
		
	}

	public String getCou_name() {
		return cou_name;
	}

	public void setCou_name(String cou_name) {
		this.cou_name = cou_name;
	}

	public String getCou_description() {
		return cou_description;
	}

	public void setCou_description(String cou_description) {
		this.cou_description = cou_description;
	}

	public int getCou_duration() {
		return cou_duration;
	}

	public void setCou_duration(int cou_duration) {
		this.cou_duration = cou_duration;
	}

	public int getCou_limit() {
		return cou_limit;
	}

	public void setCou_limit(int cou_limit) {
		this.cou_limit = cou_limit;
	}

	
	
	
	
}

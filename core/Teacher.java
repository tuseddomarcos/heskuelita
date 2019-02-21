package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Teacher extends Person {
	
	public Teacher(String name, String lastName, int phone, Date birthDay, Gender gender, DocumentType documentType,
			int document_no) {
		super(name, lastName, phone, birthDay, gender, documentType, document_no);
		// TODO Auto-generated constructor stub
	}

	private int teachId;

	

	public int getTeachId() {
		return teachId;
	}

	public void setTeachId(int teachId) {
		this.teachId = teachId;
	}

	

}

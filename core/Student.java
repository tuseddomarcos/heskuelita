package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Student extends Person {
	
	public Student(String name, String lastName, int phone, Date birthDay, Gender gender, DocumentType documentType,
			int document_no) {
		super(name, lastName, phone, birthDay, gender, documentType, document_no);
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	private int studentId;

}

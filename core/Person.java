package com.capgemini.heskuelita.beans;

import java.util.*;

public class Person {
	
	private String name;
	private String lastName;
	private int phone;
	private Date birthDay;
	private Gender gender;
	private DocumentType documentType;
	private int document_no;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastNamee(String lastName) 
	{
		this.lastName=lastName;
	}
	
	public int getPhone() 
	{
		return phone;
	}
	
	public void setPhone(int phone) 
	{
		this.phone=phone;
	}
	


	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String name,String lastName,int phone, Date birthDay, Gender gender,
			DocumentType documentType, int document_no) 
	{
		this.name=name;
		this.lastName=lastName;
		this.phone=phone;
		this.birthDay=birthDay;
		this.gender=gender;
		this.setDocumentType(documentType);
		this.document_no=document_no;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public int getDocument_no() {
		return document_no;
	}

	public void setDocument_no(int document_no) {
		this.document_no = document_no;
	}

	
}

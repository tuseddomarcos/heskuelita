package com.capgemini.heskuelita.beans;

import java.util.*;

public class Student extends Person {
	
	private Date bday;
	private String docType;
	private String docNum;
	private char sex;
	private ContactData contact;
	
	public Student(int pID, String pName, String plastName, Date pBday, String pDocType, String pDocNum, char pSex, ContactData pContact) {

		this.ID=pID;
		this.name=pName;
		this.lastName=plastName;
		this.bday=pBday;
		this.docType=pDocType;
		this.docNum=pDocNum;	
		this.sex=pSex;
		this.contact=pContact;
	
		
	}

	public Date getBday() {
		return bday;
	}

	public void setBday(Date bday) {
		this.bday = bday;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public ContactData getContact() {
		return contact;
	}

	public void setContact(ContactData contact) {
		this.contact = contact;
	}

	
	
	
}



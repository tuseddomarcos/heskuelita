package com.capgemini.heskuelita.beans;

import java.time.*;

public class Student extends Person {
	
	private LocalDate bday;
	private String docType;
	private String docNum;
	private char sex;
	private ContactData contact;
	
	
	public Student () {super ();}
	
	
	public Student(Long pID, String pName, String plastName, LocalDate pBday, String pDocType, String pDocNum, char pSex, ContactData pContact) {

		super (pID, pName, plastName);
		this.bday=pBday;
		this.docType=pDocType;
		this.docNum=pDocNum;	
		this.sex=pSex;
		this.contact=pContact;
	
		
	}


	public LocalDate getBday() {
		return bday;
	}


	public void setBday(LocalDate bday) {
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


	public void setDocNum(String docNum) throws Exception {
			
        if (docNum.trim().length() == 0 || docNum.trim().length() > 15)
        {
            throw new Exception("El documento debe contener entre 1 y 15 caracteres.");
        }
        this.docNum = docNum.trim();        
        
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



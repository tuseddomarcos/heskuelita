package com.capgemini.heskuelita.beans;
import java.util.Date;

public abstract class Person {
	
	public String name;
	public Date birthday;
	public String email;
	public char sex;
	
	public Person() {
		
	}
	
	public Person(String name, Date birthday, String email, char sex) {
		this.name=name;
		this.birthday=birthday;
		this.email=email;
		this.sex=sex;
	}
	
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
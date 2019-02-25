package com.capgemini.heskuelita.beans; 

import java.util.Date;

public class Person {

	private String Name;
	private String LastName;
    private Date BirthDay ;
    private boolean Sex;
    private String NumId;
	
    public void setName(String name) {
		Name = name; }

	public void setLastName(String lastName) {
		LastName = lastName;}

	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;}

	public void setSex(boolean sex) {
		Sex = sex;}

	public void setNumId(String numId) {
		NumId = numId;}

public Person (String Name, String LastName, Date BirthDay,Boolean Sex, String NumId ){
	
    this.Name = Name;
    this.LastName= LastName;
    this.BirthDay = BirthDay;
    this.Sex = Sex;
    this.NumId= NumId;
}

public String getName () {return Name;} 
public String getLastName () {return LastName;}
public Date getBirthDay () {return BirthDay;}
public boolean getSex () {return Sex;}
public String getNumId () {return NumId;}


}
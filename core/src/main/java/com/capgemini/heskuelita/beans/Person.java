package com.capgemini.heskuelita.beans;

import java.util.Date;

public class Person {

	private String Name;
	private String LastName;
    private String BirthDay ;
    private char Sex;
    private String NumId;
	
    public void setName(String name) {
		Name = name; }

	public void setLastName(String lastName) {
		LastName = lastName;}

	public void setBirthDay(String birthDay) {
		BirthDay = birthDay;}

	public void setSex(char sex) {
		Sex = sex;}

	public void setNumId(String numId) {
		NumId = numId;}

public Person (String Name, String LastName, String BirthDay,char Sex, String NumId ){
	
    this.Name = Name;
    this.LastName= LastName;
    this.BirthDay = BirthDay;
    this.Sex = Sex;
    this.NumId= NumId;
}

public String getName () {return Name;} 
public String getLastName () {return LastName;}
public String getBirthDay () {return BirthDay;}
public char getSex () {return Sex;}
public String getNumId () {return NumId;}


}
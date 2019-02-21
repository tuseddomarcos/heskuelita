package com.capgemini.heskuelita.beans;

public class Person {
private int id_per;
private String nombre_per;
private String apellido_per;
private int edad_per;
private char genero_per;
public int getId_per() {
	return id_per;
}
public void setId_per(int id_per) {
	this.id_per = id_per;
}
public String getNombre_per() {
	return nombre_per;
}
public void setNombre_per(String nombre_per) {
	this.nombre_per = nombre_per;
}
public String getApellido_per() {
	return apellido_per;
}
public void setApellido_per(String apellido_per) {
	this.apellido_per = apellido_per;
}
public int getEdad_per() {
	return edad_per;
}
public void setEdad_per(int edad_per) {
	this.edad_per = edad_per;
}
public char getGenero_per() {
	return genero_per;
}
public void setGenero_per(char genero_per) {
	this.genero_per = genero_per;
}
public Person() {}
public Person(int id_per, String nombre_per, String apellido_per, int edad_per, char genero_per) {
	this.nombre_per=nombre_per;
	this.id_per=id_per;
	this.genero_per=genero_per;
	this.edad_per=edad_per;
	this.apellido_per=apellido_per;
}

}

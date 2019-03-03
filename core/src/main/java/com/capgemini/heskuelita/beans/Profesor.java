package com.capgemini.heskuelita.beans;

public class Profesor extends Persona {
private int id_prof;
private int id_p1;
private String titulo_prof;
public int getId_prof() {
	return id_prof;
}
public void setId_prof(int id_prof) {
	this.id_prof = id_prof;
}
public int getId_p1() {
	return id_p1;
}
public void setId_p1(int id_per1) {
	this.id_p1 = id_per1;
}
public String getTitulo_prof() {
	return titulo_prof;
}
public void setTitulo_prof(String titulo_prof) {
	this.titulo_prof = titulo_prof;
}

public Profesor() {}

public Profesor(int id, String nombre, String apellido, String genero, String fNacimiento, int dni, int id_prof, int id_per1, String titulo_prof) {
	super(id, nombre, apellido, genero, fNacimiento, dni);
	this.id_p1=id_per1;
	this.id_prof=id_prof;
	this.titulo_prof=titulo_prof;
}

}

package com.capgemini.heskuelita.beans;

public class Persona {
private int id_p;
private String nombre_p;
private String apellido_p;
private String genero_p;
private String fNacimeinto_p;
private int dni_p;
private int id_u1;

public int getId() {
	return id_p;
}
public void setId(int id) {
	this.id_p = id;
}
public String getNombre() {
	return nombre_p;
}
public void setNombre(String nombre) {
	this.nombre_p = nombre;
}
public String getApellido() {
	return apellido_p;
}
public void setApellido(String apellido) {
	this.apellido_p = apellido;
}
public String getGenero() {
	return genero_p;
}
public void setGenero(String genero) {
	this.genero_p = genero;
}
public String getfNacimeinto() {
	return fNacimeinto_p;
}
public void setfNacimeinto(String fNacimeinto) {
	this.fNacimeinto_p = fNacimeinto;
}
public int getDni() {
	return dni_p;
}
public void setDni(int dni) {
	this.dni_p = dni;
}
public int getU() {
	return id_u1;
}
public void setU(int id_u1) {
	this.id_u1 = id_u1;
}

public Persona() {}

public Persona(int id, String nombre, String apellido, String genero, String fNacimiento, int dni) {
	this.id_p=id;
	this.nombre_p=nombre;
	this.apellido_p=apellido;
	this.genero_p=genero;
	this.fNacimeinto_p=fNacimiento;
	this.dni_p=dni;
}

}




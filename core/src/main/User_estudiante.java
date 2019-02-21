package com.capgemini.heskuelita.beans;

public class User_estudiante extends Persona_Estudiante {
private int id_ue;
private String usuario_ue;
private String clave_ue;
private int id_est1;
public int getId_ue() {
	return id_ue;
}
public void setId_ue(int id_ue) {
	this.id_ue = id_ue;
}
public String getUsuario_ue() {
	return usuario_ue;
}
public void setUsuario_ue(String usuario_ue) {
	this.usuario_ue = usuario_ue;
}
public String getClave_ue() {
	return clave_ue;
}
public void setClave_ue(String clave_ue) {
	this.clave_ue = clave_ue;
}
public int getId_est1() {
	return id_est1;
}
public void setId_est1(int id_est1) {
	this.id_est1 = id_est1;
}

public User_estudiante() {}

}

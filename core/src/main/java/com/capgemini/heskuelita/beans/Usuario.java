package com.capgemini.heskuelita.beans;

public class Usuario {
private int id_u;
private String usuario_u;
private String clave_u;
private int id_p3;

public int getId_p3() {
	return id_p3;
}
public void setId_p3(int id_p3) {
	this.id_p3 = id_p3;
}
public int getId_u() {
	return id_u;
}
public void setId_u(int id_u) {
	this.id_u = id_u;
}
public String getUsuario() {
	return usuario_u;
}
public void setUsuario(String usuario) {
	this.usuario_u = usuario;
}
public String getClave() {
	return clave_u;
}
public void setClave(String clave) {
	this.clave_u = clave;
}
public Usuario() {}
public Usuario(int id_u, String usuario_u, String clave_u) {
	this.clave_u=clave_u;
	this.id_u=id_u;
	this.usuario_u=usuario_u;
}
}

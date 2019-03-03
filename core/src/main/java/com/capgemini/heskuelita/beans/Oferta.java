package com.capgemini.heskuelita.beans;

public class Oferta {
private int id_o;
private String horario_o; 
private String dias_o;
public int getId_o() {
	return id_o;
}
public void setId_o(int id_o) {
	this.id_o = id_o;
}
public String getHorario_o() {
	return horario_o;
}
public void setHorario_o(String horario_o) {
	this.horario_o = horario_o;
}
public String getDias_o() {
	return dias_o;
}
public void setDias_o(String dias_o) {
	this.dias_o = dias_o;
}
public Oferta() {}
public Oferta(int id_o, String horario_o, String dias_o){
	this.dias_o=dias_o;
	this.horario_o=horario_o;
	this.id_o=id_o;
}
}

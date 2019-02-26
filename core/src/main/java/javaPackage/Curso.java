package javaPackage;

public class Curso {
private int id_c;
private String nombre_c;
private int duracion_c;
private int limite_c;
private String objetivo_c;
public int getId_c() {
	return id_c;
}
public void setId_c(int id_c) {
	this.id_c = id_c;
}
public String getNombre_c() {
	return nombre_c;
}
public void setNombre_c(String nombre_c) {
	this.nombre_c = nombre_c;
}
public int getDuracion_c() {
	return duracion_c;
}
public void setDuracion_c(int duracion_c) {
	this.duracion_c = duracion_c;
}
public int getLimite_c() {
	return limite_c;
}
public void setLimite_c(int limite_c) {
	this.limite_c = limite_c;
}
public String getObjetivo_c() {
	return objetivo_c;
}
public void setObjetivo_c(String objetivo_c) {
	this.objetivo_c = objetivo_c;
}

public Curso() {}
public Curso(int id_c, String nombre_c, int duracion_c, int limite_c, String objetivo_c) {
	this.id_c = id_c;	
	this.nombre_c = nombre_c;
	this.duracion_c = duracion_c;
	this.limite_c = limite_c;
	this.objetivo_c = objetivo_c;
}
}

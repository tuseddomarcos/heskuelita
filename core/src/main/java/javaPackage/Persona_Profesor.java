package javaPackage;

public class Persona_Profesor extends Person {
private int id_prof;
private int id_per1;
private String titulo_prof;

public int getId_prof() {
	return id_prof;
}
public void setId_prof(int id_prof) {
	this.id_prof = id_prof;
}
public int getId_per1() {
	return id_per1;
}
public void setId_per1(int id_per1) {
	this.id_per1 = id_per1;
}
public String getTitulo_prof() {
	return titulo_prof;
}
public void setTitulo_prof(String titulo_prof) {
	this.titulo_prof = titulo_prof;
}

public Persona_Profesor(int id_per, String nombre_per, String apellido_per, int edad_per, String genero_per, int id_prof, int id_per1, String titulo_prof) {
super(id_per, nombre_per, apellido_per, edad_per, genero_per);
this.id_per1=id_per1;
this.id_prof=id_prof;
this.titulo_prof=titulo_prof;
}
public Persona_Profesor() {}
}

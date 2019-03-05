package com.capgemini.heskuelita.beans;

public class Curso_Aula {
private int id_c6;
private int id_au1;
public int getId_c6() {
	return id_c6;
}
public void setId_c6(int id_c6) {
	this.id_c6 = id_c6;
}
public int getId_au1() {
	return id_au1;
}
public void setId_au1(int id_au1) {
	this.id_au1 = id_au1;
}

public Curso_Aula() {}
public Curso_Aula(int id_c6, int id_au1) {
	this.id_au1=id_au1;
	this.id_c6 = id_c6;
}

}

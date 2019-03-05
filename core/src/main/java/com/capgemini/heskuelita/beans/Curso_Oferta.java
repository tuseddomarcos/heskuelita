package com.capgemini.heskuelita.beans;

public class Curso_Oferta {
private int id_o1;
private int id_c4;
public int getId_o1() {
	return id_o1;
}
public void setId_o1(int id_o1) {
	this.id_o1 = id_o1;
}
public int getId_c4() {
	return id_c4;
}
public void setId_c4(int id_c4) {
	this.id_c4 = id_c4;
}
public Curso_Oferta() {}
public Curso_Oferta(int id_o1, int id_c4) {
	this.id_c4=id_c4;
	this.id_o1=id_o1;
}

}

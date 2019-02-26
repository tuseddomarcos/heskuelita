package javaPackage;

public class Oferta {
private int id_f;
private String horario_f;
private String dias_f;
public int getId_f() {
	return id_f;
}
public void setId_f(int id_f) {
	this.id_f = id_f;
}
public String getHorario_f() {
	return horario_f;
}
public void setHorario_f(String horario_f) {
	this.horario_f = horario_f;
}
public String getDias_f() {
	return dias_f;
}
public void setDias_f(String dias_f) {
	this.dias_f = dias_f;
}

Oferta(){}
Oferta(int id_f, String horario_f, String dias_f){
	this.dias_f=dias_f;
	this.horario_f=horario_f;
	this.id_f=id_f;
}

}

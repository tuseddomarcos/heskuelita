package javaPackage;

public class Aula {
private int id_au;
private int num_au;
private int capacidad_au;
public int getId_au() {
	return id_au;
}
public void setId_au(int id_au) {
	this.id_au = id_au;
}
public int getNum_au() {
	return num_au;
}
public void setNum_au(int num_au) {
	this.num_au = num_au;
}
public int getCapacidad_au() {
	return capacidad_au;
}
public void setCapacidad_au(int capacidad_au) {
	this.capacidad_au = capacidad_au;
}

public Aula() {}
public Aula(int id_au, int num_au, int capacidad_au) {
	this.id_au=id_au;
	this.num_au = num_au;
	this.capacidad_au=capacidad_au;
}

}

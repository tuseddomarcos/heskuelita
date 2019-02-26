package javaPackage;

public class User_profesor extends Persona_Profesor{
private int id_up;
private String usuario_up;
private String clave_up;
private int id_prof1;
public int getId_up() {
	return id_up;
}
public void setId_up(int id_up) {
	this.id_up = id_up;
}
public String getUsuario_up() {
	return usuario_up;
}
public void setUsuario_up(String usuario_up) {
	this.usuario_up = usuario_up;
}
public String getClave_up() {
	return clave_up;
}
public void setClave_up(String clave_up) {
	this.clave_up = clave_up;
}
public int getId_prof1() {
	return id_prof1;
}
public void setId_prof1(int id_prof1) {
	this.id_prof1 = id_prof1;
}

public User_profesor(int id_up, String usuario_up, String clave_up, int id_prof) {
	this.clave_up=clave_up;
	this.id_prof1=id_prof;
	this.id_up=id_up;
	this.usuario_up=usuario_up;
}

public User_profesor() {}

}

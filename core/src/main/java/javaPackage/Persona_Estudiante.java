package javaPackage;

public class Persona_Estudiante extends Person {
	private int id_est;
	private int id_per2;
	private int anio_est;
	public int getId_est() {
		return id_est;
	}
	public void setId_est(int id_est) {
		this.id_est = id_est;
	}
	public int getId_per2() {
		return id_per2;
	}
	public void setId_per2(int id_per2) {
		this.id_per2 = id_per2;
	}
	public int getAnio_est() {
		return anio_est;
	}
	public void setAnio_est(int anio_est) {
		this.anio_est = anio_est;
	}
	
	public Persona_Estudiante(int id_per, String nombre_per, String apellido_per, int edad_per, String genero_per, int id_est, int id_per2, int anio_est) {
		super(id_per, nombre_per, apellido_per, edad_per, genero_per);
		this.id_est = id_est;
		this.anio_est = anio_est;
		this.id_per2=id_per2;
	}
	
	public Persona_Estudiante() {}
	
}

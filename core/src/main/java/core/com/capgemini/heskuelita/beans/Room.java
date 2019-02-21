package core.com.capgemini.heskuelita.beans;

import java.util.ArrayList;

public  class Room implements ICourseFunctions{
	private int Comision;
	private String nombreMateria;
	//private String horario;
	private int Capacidad;
	public ArrayList<Student>Cursantes;
	
	public Room(String nombreMateria, int Comision , int Capacidad){
		this.nombreMateria = nombreMateria;
		this.Comision = Comision;
		this.Capacidad = Capacidad;
		this.Cursantes = new ArrayList<Student>();
		
	}

	public int getComision() {
		return Comision;
	}

	public void setComision(int comision) {
		Comision = comision;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public int getCapacidad() {
		return Capacidad;
	}

	public void setCapacidad(int capacidad) {
		Capacidad = capacidad;
	}

	
	public void AnotarAlumno(Student S) {
		if(Cursantes.size() <= Capacidad) {
			Cursantes.add(S);
		}
		else {
			throw new IllegalArgumentException("El aula esta llena");			
		}
	}

	public Student BuscarAlumno(int dni) {
		for(Student estudiante : Cursantes) {
			if(estudiante.getDni() == dni) {
				return estudiante;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
}

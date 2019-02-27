package core.com.capgemini.heskuelita.beans;

import java.util.ArrayList;

public  class Room implements ICourseFunctions{
	private int Comision;
	private String nombreMateria;
	//private String horario;
	private int Capacidad;
	private ArrayList<Student>Cursantes;
	private int Registrados;
	
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
		if(Cursantes.size() < Capacidad) {
			Cursantes.add(S);
			Registrados++;
		}
		else {
			throw new IllegalArgumentException("El aula esta llena");			
		}
	}
	
	public void EliminarAlumno(Student S) {
		for(Student estudiante : Cursantes) {
			if(estudiante.equals(S)) {
				Cursantes.remove(S);
				Registrados--;
				break;
			}
		}
	}

	public Student BuscarPorDNI(int dni) {
		for(Student estudiante : Cursantes) {
			if(estudiante.getDni() == dni) {
				return estudiante;
			}
		}
		return null;
	}
	
	public ArrayList<Student> BuscarPorNombre(String nombre) {
		ArrayList<Student> busqueda = new ArrayList<>();
		for(Student estudiante : Cursantes) {
			if(estudiante.getName().compareTo(nombre) == 0) {
				busqueda.add(estudiante);
			}
		}
		return busqueda;
	}
	
	public ArrayList<Student> BuscarPorMail(String mail) {
		ArrayList<Student> busqueda = new ArrayList<>();
		for(Student estudiante : Cursantes) {
			if(estudiante.getEmail().contains(mail)) {
				busqueda.add(estudiante);
			}
		}
		return busqueda;
	}

	public int getRegistrados() {
		return Registrados;
	}
	
}

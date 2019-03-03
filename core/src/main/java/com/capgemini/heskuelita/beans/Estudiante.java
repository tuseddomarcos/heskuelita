package com.capgemini.heskuelita.beans;

public class Estudiante extends Persona{
	private int id_est;
	private int id_p2;
	private int anio_est;

	public Estudiante() {}

	public Estudiante(int id, String nombre, String apellido, String genero, String fNacimiento, int dni, int id_est, int id_per2, int anio_est) {
		super(id, nombre, apellido, genero, fNacimiento, dni);
		this.setId_est(id_est);
		this.setId_p2(id_per2);
		this.setAnio_est(anio_est);
	}

	public int getId_est() {
		return id_est;
	}

	public void setId_est(int id_est) {
		this.id_est = id_est;
	}

	public int getId_p2() {
		return id_p2;
	}

	public void setId_p2(int id_p2) {
		this.id_p2 = id_p2;
	}

	public int getAnio_est() {
		return anio_est;
	}

	public void setAnio_est(int anio_est) {
		this.anio_est = anio_est;
	}

	}


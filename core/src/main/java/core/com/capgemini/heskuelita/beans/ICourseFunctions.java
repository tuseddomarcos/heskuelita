package core.com.capgemini.heskuelita.beans;

import java.util.ArrayList;

public interface ICourseFunctions {
	void AnotarAlumno(Student S);
	void EliminarAlumno(Student S);
	ArrayList<Student> BuscarPorNombre(String name);
	Student BuscarPorDNI(int dni);
	ArrayList<Student> BuscarPorMail(String mail);
	
}

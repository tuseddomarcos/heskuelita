package com.capgemini.heskuelita.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DAOStudent {
	
	private static final List<Student> students= new ArrayList<Student>();
	
	//probar esto con Lombok
	public void cargarDatos() {
		
		Student student= new Student("Ned","Stark", 30897564, 'M');
		student.setPhone(1524559912);
		Student student2= new Student("Jaime","Lannister", 28887543, 'M');
		student2.setEmail("jaime@gmail.com");
		Student student3= new Student("Danaerys","Targaryen", 10897143, 'F');
		student3.setEmail("dany@hotmail.com");
		Student student4= new Student("Jon","Snow", 15832156, 'M');
		Student student5= new Student("Cersei","Lannister", 23856786, 'F');
		Student student6= new Student("Ramsey","Bolton", 27816726, 'M');
		student.setEmail("ramsey@gmail.com");
		
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}
	
	public Student findByDNI(int dni) {
		return students.stream().filter(s -> s.getDni() == dni).findFirst().get();
	}
	
	public Student findyByLastName(String lastName) {
		return students.stream().filter(s -> s.getLastName().equals(lastName)).findFirst().get();
	}
	
	public Student findByPhone(int phone) {
		return students.stream().filter(s -> s.getPhone() == phone).findFirst().get();
	}
	
	public List<Student> findMales(){
		return students.stream().filter(s -> s.getGender() == 'M').collect(Collectors.toList());
	}
	
	public List<Student> findByTypeOfMail(String tipoMail){
		return students.stream().filter(s -> s.getEmail().contains(tipoMail))
				.collect(Collectors.toList());
	}
	
	public void deleteByDNI(int dni) {
		students.remove(students.stream().filter(s -> s.getDni() == dni).findFirst().get());
	}
	
	public void deleteByMail(String mail) {
		students.remove(students.stream().filter(s -> s.getEmail().equals(mail)));
	}
	
	public void deleteByTypeOfMail(String tipoMail) {
		students.removeAll(students.stream().filter(s -> s.getEmail().contains(tipoMail))
				                                           .collect(Collectors.toList()));
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	
}

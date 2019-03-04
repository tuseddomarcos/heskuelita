package com.capgemini.heskuelita.workhome.lambda;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.services.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class StudentService implements IStudentService {
	
	private ArrayList<Student> listStudents;
	
	public StudentService() {
		// TODO Auto-generated constructor stub
		listStudents = new DBMock().getStudents(); 
	}

	@Override
	public void enrollStudent(Student student) {
		listStudents.add(student);

	}

	@Override
	public void deleteStudent(Student student) {
		listStudents.remove(listStudents.indexOf(student));

	}

	@Override
	public void updateStudent(Student student) {
		this.deleteStudent(student);
		this.enrollStudent(student);
	}

	@Override
	public Student findByIdentification(Student student) {
		return listStudents.stream().filter(s -> s.getIdentification()==student.getIdentification()).findFirst().orElse(null);
	}

	@Override
	public List<Student> findByEmailConcurrence(String concurrence) {
		List<Student> listStudent = listStudents.stream().filter(s -> s.getEmail().contains(concurrence)).collect(Collectors.toList());
		return listStudent;
	}

	@Override
	public Student findByEmail(Student student) {
		return listStudents.stream().filter(s -> s.getEmail()==student.getEmail()).findFirst().orElse(null);
	}
	
	public int cantStudent() {
		return this.listStudents.size();
	}
	
	public ArrayList<Student> getStudents(){
		return listStudents;
	}

}

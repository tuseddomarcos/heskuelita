package com.capgemini.heskuelita.servicesImplementation;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.services.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.capgemini.heskuelita.beans.*;;

public class StudentService implements IStudentService {
	
	private ArrayList<Student> listStudents;
	
	public StudentService() {
		// TODO Auto-generated constructor stub
		listStudents = new ArrayList<Student>(BeanData.getStudents()); 
		
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
		// TODO Auto-generated method stub

	}

	@Override
	public Student findByIdentification(Student student) {
		List<Student> streamStudent= listStudents.stream().filter(s -> s.getIdentification()==student.getIdentification()).collect(Collectors.toList());
		if(streamStudent!= null) {
			return streamStudent.get(0);
		}
		return null;
	}
}


package com.capgemini.heskuelita.services;

import java.util.*;

import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Student;

public interface IStudentService {
	
	public void AddStudent(Student pStudent);
	
	public void DeleteStudent(Student pStudent);
	
	public ArrayList<Student> StudentByCourse(Student pStudent, Course pCourse);
	
	public ArrayList<Student> StudentOrderByAge(Student pStudent);
	
}
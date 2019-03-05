
package com.capgemini.heskuelita.services;

import java.util.*;

import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Student;

public interface IStudentDao {
	
	public ArrayList<Student> ListStudents(); 
	
	public void AddStudent(Student pStudent);
	
	public void DeleteStudentByDNI(String pDocNum);
		
	public ArrayList<User> FindByUserEmail(String pEmail);
	
	public ArrayList<Student> FilterBySex(Char pSex);
}
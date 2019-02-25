package com.capgemini.heskuelita.beans;

import java.util.Date;
import java.util.List;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.beans.Course;


public interface IStudentService {
	
	//Adds student
	void AddStudent (Student student);
	
	//Finds ONE student with specific info, 
	Student FindbyIdentification (int identification);
	Student FindbyId (int id);
	
	//Finds multiple students
	List<Student> FindbyName (String name);
	List<Student> FindbyLastName (String lastname);
	List<Student> FindbyCompleteName (String name, String lastName);	
	List<Student> FindbyBirthdate (Date birthdate);
	List<Student> FindbySex (char sex);
	List<Student> FindbyCity (String city);	
	List<Student> FindbyPhone (int phone);
	List<Student> FindbyDocumentType (String documentType);
	List<Student> FindbyZipcode (int zipcode);
	List<Student> FindbyAdress (String adress);
	List<Student> FindbyActive (boolean active);
	List<Student> FindbyActive (Course course);
	
	//Modifys student info
	Student ChangeName (Student student ,String name);
	Student ChangeLastName (Student student ,String lastname);
	Student ChangeBirthdate (Student student ,Date birthdate);
	Student ChangeSex (Student student ,char sex);
	Student ChangeCity (Student student ,String city);	
	Student ChangePhone (Student student ,int phone);
	Student ChangeDocumentType (Student student ,String documentType);
	Student ChangeZipcode (Student student ,int zipcode);
	Student ChangeAdress (Student student ,String adress);
	Student ChangeActive (Student student ,Course course);
	
	//Showing all the students 
	List<Student> ShowAll();	
	
	//Show a Student courses
	List<Course> ShowActiveCourses(Student student);
	
	//Add a course to the student
	Student AddStudentCourse (Student student, Course course);
	
	//Delete a course to the student
	Student DeleteStudentCourse (Student student, Course course);

	//Desactivate a student
	void DesactivateStudent(Student student ,boolean active);
	

}

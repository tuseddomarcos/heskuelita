package com.capgemini.heskuelita.beans;

import java.util.Date;
import java.util.List;

import com.capgemini.heskuelita.beans.Professor;
import com.capgemini.heskuelita.beans.Course;


public interface IProfessorService {
	
	//Adds professor
	void AddProfessor (Professor professor);
	
	//Finds ONE professor with specific info, 
	Professor FindbyIdentification (int identification);
	Professor FindbyId (int id);
	
	//Finds multiple professors
	List<Professor> FindbyName (String name);
	List<Professor> FindbyLastName (String lastname);
	List<Professor> FindbyCompleteName (String name, String lastName);	
	List<Professor> FindbyBirthdate (Date birthdate);
	List<Professor> FindbySex (char sex);
	List<Professor> FindbyCity (String city);	
	List<Professor> FindbyPhone (int phone);
	List<Professor> FindbyDocumentType (String documentType);
	List<Professor> FindbyZipcode (int zipcode);
	List<Professor> FindbyAdress (String adress);
	List<Professor> FindbyActive (boolean active);
	List<Professor> FindbyActive (Course course);
	
	//Modifys professor info
	Professor ChangeName (Professor professor ,String name);
	Professor ChangeLastName (Professor professor ,String lastname);
	Professor ChangeBirthdate (Professor professor ,Date birthdate);
	Professor ChangeSex (Professor professor ,char sex);
	Professor ChangeCity (Professor professor ,String city);	
	Professor ChangePhone (Professor professor ,int phone);
	Professor ChangeDocumentType (Professor professor ,String documentType);
	Professor ChangeZipcode (Professor professor ,int zipcode);
	Professor ChangeAdress (Professor professor ,String adress);
	Professor ChangeActive (Professor professor ,Course course);
	
	//Showing all the professors 
	List<Professor> ShowAll();	
	
	//Show a Professor courses
	List<Course> ShowActiveCourses(Professor professor);
	
	//Add a course to the professor
	Professor AddProfessorCourse (Professor professor, Course course);
	
	//Delete a course to the professor
	Professor DeleteProfessorCourse (Professor professor, Course course);

	//Desactivate a professor
	void DesactivateProfessor(Professor professor ,boolean active);
	

}

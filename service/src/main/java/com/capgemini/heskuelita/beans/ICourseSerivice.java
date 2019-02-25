package com.capgemini.heskuelita.beans;

import java.util.List;

import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Professor;
import com.capgemini.heskuelita.beans.Classroom;

public interface ICourseSerivice {
	
	//Adds Course
	void AddCourse (Course course);
	
	//Finds ONE Course with specific info, 
	Course FindbyId (int id);
	
	//Finds multiple Courses
	List<Course> FindbyName (String name);
	List<Course> FindbyDescription (String description);
	List<Course> FindbyDuration (int duration);	
	List<Course> FindbyLimitPerson (int limitPerson);	
	List<Course> FindbyActive( boolean active); 
	List<Course> FindbyProfessor(Professor professor);  
	List<Course> FindbyClassroom(Classroom classroom);  
	
	//Modifys Course info
	Course ChangeName (Course course, String name);
	Course ChangeDescription (Course course, String description);	
	Course ChangeId (Course course, int id);
	Course ChangeDuration (Course course, int duration);
	Course ChangeLimitPerson (Course course, int limitPerson);
	Course ChangeActive(Course course, boolean active); 
	Course ChangeProfessor(Course course, Professor professor);  
	Course ChangeClassroom(Course course, Classroom classroom);  
	
	//Showing all the Courses 
	List<Course> ShowAll();	

	//Show the professor of the course
	List<Professor> ShowCourseProfessor(Course Course);
	
	//Show the professor of the course
	List<Classroom> ShowCourseClassroom(Course Course);
	
	//Add professor to courses
	Course AddCourseProfessor (Course Course, Professor professor);
	
	//Add Classroom to courses
	Course AddCourseClassroom (Course Course, Classroom classroom);
	
	//Delete professor to courses
	Course DeleteCourseProfessor (Course Course, Professor professor);
	
	//Delete Classroom to courses
	Course DeleteCourseClassroom (Course Course, Classroom classroom);
	
	//Desactivate a Course
	void DesactivateCourse(Course Course);
	
	
}

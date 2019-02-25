package com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.capgemini.heskuelita.beans.Schedule;
import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.beans.Course;
import com.capgemini.heskuelita.beans.Professor;
import com.capgemini.heskuelita.beans.Classroom;

public interface IScheduleService {

	//Adds Schedule
	void AddSchedule (Schedule schedule);
	
	//Finds one or some Schedule with specific info, 
	Schedule FindbyId (int id);
	List<Schedule> FindbyCourse (Course course);	
	List<Schedule> FindbyProfessor (Professor professor);
	List<Schedule> FindbyClassroom (Classroom classroom);
	List<Schedule> FindbyStartDate (LocalDate startDate);
	List<Schedule> FindbyEndDate (LocalDate endDate);	
	List<Schedule> FindbyDays (String days);
	List<Schedule> FindbyStartHour (LocalTime  startHour);
	List<Schedule> FindbyEndHour (LocalTime  endHour);
	List<Schedule> FindbyVacancy (boolean vacancy);
	List<Schedule> FindbyStudentsQuantity (int studentsQuantity);
	List<Schedule> FindbyStudent (Student[] student);
	
	//Showing all the Schedules 
	List<Schedule> ShowAll();	
	
	//Modifys Schedule info
	Schedule ChangeId (Schedule schedule, int id);
	Schedule ChangeCourse (Schedule schedule, Course course);	
	Schedule ChangeProfessor (Schedule schedule, Professor professor);
	Schedule ChangeClassroom (Schedule schedule, Classroom classroom);
	Schedule ChangeStartDate (Schedule schedule, LocalDate startDate);
	Schedule ChangeEndDate (Schedule schedule, LocalDate endDate);	
	Schedule ChangeDays (Schedule schedule, String days);
	Schedule ChangeStartHour (Schedule schedule, LocalTime  startHour);
	Schedule ChangeEndHour (Schedule schedule, LocalTime  endHour);
	Schedule ChangeVacancy (Schedule schedule, boolean vacancy);
	Schedule ChangeStudentsQuantity (Schedule schedule, int studentsQuantity);
	Schedule ChangeStudent (Schedule schedule, Student[] student);

	//Adds Student
	void AddStudent (Schedule schedule, Student student);
	
	//Delete Student
	void DeleteStudent (Schedule schedule, Student student);
	
	//Show students inscripted
	List<Student> ShowScheduleStudents (Schedule schedule);
	
	//Delete a Schedule
	void DeleteSchedule(Schedule Schedule);
	
}
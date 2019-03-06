package com.capgemini.heskuelita.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Schedule extends Component {
	
	//Declaration of Schedule atributes
	private Course course;
	private Professor professor;
	private Classroom classroom;
	private LocalDate startDate;
	private LocalDate endDate;
	private String days;
	private LocalTime  startHour;
	private LocalTime  endHour;
	private boolean vacancy = true;		//is there vacancy in this course?
	private int studentsQuantity;		//quantity of students inscripted 
	private List<Student> student;		//whos inscripted
	
	// Getters and Setters: Course
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	//Getters and Setters: Professors
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessors(Professor professor) {
		this.professor = professor;
	}	
	
	//Getters and Setters: Classrooms
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassrooms(Classroom classroom) {
		this.classroom = classroom;
	}	
	
	// Getters and Setters: StartDate
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	// Getters and Setters: EndDate
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	// Getters and Setters: Days
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	
	// Getters and Setters: StartHour
	public LocalTime getStartHour() {
		return startHour;
	}
	public void setStartHour(LocalTime startHour) {
		this.startHour = startHour;
	}
	
	// Getters and Setters: EndHour
	public LocalTime getEndHour() {
		return endHour;
	}
	public void setEndHour(LocalTime endHour) {
		this.endHour = endHour;
	}
	
	//Getters and Setters: Vacancy
	public boolean getVacancy() {
		return vacancy;
	}
	public void setVacancy(boolean vacancy) {
		this.vacancy = vacancy;
	}	
	
	//Getters and Setters: StudentsQuantity
	public int getStudentsQuantity() {
		return studentsQuantity;
	}
	public void setStudentsQuantity(int studentsQuantity) {
		this.studentsQuantity = studentsQuantity;
	}	
	
	//Getters and Setters: Students
	public List<Student> getStudents() {
		return student;
	}
	public void setStudents(List<Student> student) {
		this.student = student;
	}	
	
	//Constructor without atributes
	public Schedule () {
		super();
	}
	// Constructor ALL Schedule atributes 
	public Schedule (long id, Course course, Professor professor, Classroom classroom, LocalDate startDate, LocalDate endDate, 
			String days, LocalTime  startHour, LocalTime  endHour, boolean vacancy, int studentsQuantity, List<Student> student) {
		super(id);
		this.course = course;
		this.professor = professor;
		this.classroom = classroom;
		this.startDate = startDate;
		this.endDate = endDate;
		this.days = days;
		this.startHour = startHour;
		this.endHour = endHour;
		this.vacancy = vacancy;
		this.studentsQuantity = studentsQuantity;
		this.student = student;
	}
	
}

package com.capgemini.heskuelita.beans;

import java.util.Set;
//import org.joda.time.LocalDate;

public class OfferCourse extends Component{

	private Course course;
	private Teacher teacher;
	private Set<Student> students;
	private Classroom classroom;
//	private LocalDate date;
//	private LocalTime time;
	
	public OfferCourse(Course course, Teacher teacher, Classroom classroom){
		this.course= course;
		this.teacher= teacher;
		this.classroom= classroom;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void removeStudent(Student student) {
		this.students.remove(student);
	}
	
	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	
	
	
}

package core.com.capgemini.heskuelita.beans;

import java.util.*;

public class Data {
	
	private static final List<Student> students=new ArrayList<Student>();
	private static final List<Course> courses=new ArrayList<Course>();
	
	public static void agragarStudent(Student student) {
		students.add(student);
	}

	public static void agragarCourse(Course course) {
		courses.add(course);
	}

	public static List<Student> getStudents() {
		return students;
	}

	public static List<Course> getCourses() {
		return courses;
	}

}

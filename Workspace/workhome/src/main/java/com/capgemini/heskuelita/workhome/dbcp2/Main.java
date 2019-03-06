package com.capgemini.heskuelita.workhome.dbcp2;

import java.sql.SQLException;
import java.util.Set;

import com.capgemini.heskuelita.beans.Course;

public class Main {

	public static void main(String[] args) throws SQLException {
		DAOCourse dao= new DAOCourse();
		dao.ConnectDatabase();
		Set<Course> c = dao.getCourses();
		for (Course course : c) {
			System.out.println( course.getId() + " " +
								course.getNameCourse() + " " +
								course.getDescription() + " " +
								course.getDuration() + " " +
								course.getLimitPerson()
			);
		}

	}

}

package com.capgemini.heskuelita.workhome.dbcp2;

import org.apache.log4j.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.capgemini.heskuelita.beans.Course;

public class DAOCourse extends DataAccessObject {
	
	private static final Logger logger = Logger.getLogger (DAOCourse.class);
		
	public DAOCourse() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	private void writeResult (ResultSet rs) throws SQLException {

        // ResultSet is initially before the first data set
        while (rs.next ()) {

            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring (2);
            String idCourse = rs.getString (1);
            String nameCourse   = rs.getString (2);
            String description = rs.getString (3);
            String duration = rs.getString (4);
            String limitPerson = rs.getString (5);
            

            logger.info (String.format ("ID: %s", idCourse));
            logger.info (String.format ("NAME: %s",nameCourse ));
            logger.info (String.format ("DESCRIPTION: %s", description));
            logger.info (String.format ("DUARATION: %s", duration));
            logger.info (String.format ("LIMIT_PERSON: %s", limitPerson));
        }
    }
	
	
	public Set<Course> getCourses(){
		Set <Course> courses = new HashSet<Course>(); 
		try {
			Statement statement = this.getDataSource().getConnection().createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM public.\"COURSE\"");
			writeResult(result);
			while(result.next()) {
				long idCourse = result.getLong("id_course");
				String nameCourse = result.getString("name_course");
				String description = result.getString("description");
				int duration = result.getInt("duration");
				int limitPerson = result.getInt("limit_person");
				courses.add(new Course(idCourse, nameCourse, description, duration, limitPerson));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}
	
	
}

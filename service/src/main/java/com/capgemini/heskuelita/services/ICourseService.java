
package com.capgemini.heskuelita.services;

import java.util.ArrayList;
import com.capgemini.heskuelita.beans.*;


public interface ICourseService extends IGerenicCrud<Course, Long> {
	
	//crud + extra methods 
	
	public ArrayList<Course> CourseObjetives (Course pCourse, CourseObjetives pCourseObjetives) ;
	
	public int CourseLimit (Course pCourse);
	
	public int CourseDurationClasses(Course pCourse);
	
}
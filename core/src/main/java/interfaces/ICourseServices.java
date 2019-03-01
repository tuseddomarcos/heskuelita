package interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

import beans.Course;

public interface ICourseServices {
	
	public Course findByNumberClassroom(int numberClassroom) ;
	
	public ArrayList filterByADate(LocalDate aDate) ;
	
	public ArrayList filterByAnHour(LocalDate aTime) ;
	
}

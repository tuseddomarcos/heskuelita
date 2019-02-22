package beans;

import java.util.ArrayList;

public interface ICourseServices {
	
	public Course findByNumberClassroom(int numberClassroom) ;
	
	public ArrayList filterByADay(String aDay) ;
	
	public ArrayList filterByAnHour(int anHour) ;
	
}

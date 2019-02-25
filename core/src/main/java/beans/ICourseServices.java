package beans;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ICourseServices {
	
	public Course findByNumberClassroom(int numberClassroom) ;
	
	public ArrayList filterByADate(LocalDate aDate) ;
	
	public ArrayList filterByAnHour(LocalDate aTime) ;
	
}

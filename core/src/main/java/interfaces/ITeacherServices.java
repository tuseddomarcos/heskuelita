package beans;

import java.util.ArrayList;

public interface ITeacherServices {
	
	public void addTeacher(Teacher aTeacher) ;
	
	public void deleteTeacher(Teacher aTeacher) ;
	
	public void deleteTeacherByDNI(int dni) ;
	
	public Teacher findByDNI(int dni) ;
	
	public Teacher findByCourse(int course) ;
	
	public ArrayList<Teacher> findByLastName(String aLastName) ;

}

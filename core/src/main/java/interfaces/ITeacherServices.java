package interfaces;

import java.util.ArrayList;

import beans.Teacher;

public interface ITeacherServices {
	
	public void addTeacher(Teacher aTeacher) ;
	
	public void deleteTeacher(Teacher aTeacher) ;
	
	public void deleteTeacherByIdentification(int identification) ;
	
	public Teacher findByIdentification(int identification) ;
	
	public Teacher findByCourse(int course) ;
	
	public ArrayList<Teacher> findByLastName(String aLastName) ;

}

package beans;

import java.util.ArrayList;

public interface IStudentServices {
	
	public void addUser(Student aStudent) ;
	
	public void deleteUser(Student aStudent) ;
	
	public Student findUserByDNI(int dni) ;
	
	public ArrayList<Student> findUsersByLastName(String aLastName) ;
	
}

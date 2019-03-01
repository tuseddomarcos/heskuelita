package interfaces;

import java.util.ArrayList;

import beans.Student;

public interface IStudentServices {
	
	public void addUser(Student aStudent) ;
	
	public void deleteUser(Student aStudent) ;
	
	public ArrayList<Student> findUserByIdentification(int identification) ;
	
	public ArrayList<Student> findUsersByLastName(String aLastName) ;
	
	public Student findUserByEmail (String email) ;
	
	public ArrayList<Student> findUserByTelephone(int telephone) ;
	
}

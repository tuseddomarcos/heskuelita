package com.capgemini.heskuelita.beans;

import com.capgemini.heskuelita.services.IStudentDao;

import java.time.LocalDate;
import java.util.*;


public class StudentDaoImpl implements IStudentDao {

	
	private  ArrayList <Student> students;	
	private ContactData CD;
	private ArrayList <Course> courses;
	private ArrayList <User> users;
	
	
	public StudentDaoImpl() {
		super ();
		
			this.students = new ArrayList <Student> (
						Arrays.asList(
										
										Student stu1 = new Student((long) 1, "julio", "perez", LocalDate.of(1995, 5, 2), "dni", "39178688", 'm', CD = new ContactData( "1165898568", "castelar", "2023", "1706")),		
										Student stu2 = new Student((long) 2, "maria", "blanco", LocalDate.of(1993, 2, 11), "dni", "37171238", 'm', CD = new ContactData("1175656893", "haedo", "1042", "2045")),	
										Student stu3 = new Student((long) 3, "esteban", "quito", LocalDate.of(1985, 5, 1), "dni", "30881688", 'm', CD = new ContactData( "1132121444", "suipacha", "232", "9072")),	
										Student stu4 = new Student((long) 4, "luisa", "malek", LocalDate.of(1999, 8, 8), "dni", "50555898", 'm', CD = new ContactData( "1122266587", "charcas", "111", "2112"))
										)
			
			);
			
			
			this.courses = new ArrayList <Course>(
						Arrays.asList(										
										new Course((long) 1, "OOP", "Object Orient Programming", 15, 20),
										new Course((long) 2, "DB", "Database", 12, 20),
										new Course((long) 3, "HTML5", "HyperText Markup Language", 10 ,20),
										new Course((long) 4, "Java", "Java Standard Programming", 15,20)
										)
					
					
					
			);
			
			
			this.users = new ArrayList <User>(
						Array.asList(
										
										new User((long) 1, "1234", "jperez@gmail.com", stu1),
										new User((long) 2, "112233", "mblanco@hotmail.com", stu2),
										new User((long) 3, "4321", "equito@hotmail.com", stu3),
										new User((long) 4, "332211", "luisam@gmail.com", stu4)
										)
			);
					
						
					
	}

	@Override
	public ArrayList<Student> ListStudents(){
		return students;
	}
	
	@Override
	public void AddStudent(Student pStudent) {
		students.add(pStudent);
	}
	
	@Override
	public void DeleteStudentByDNI(String pDocNum) {
		students.remove(students.stream().filter(s -> s.getDocNum() == pDocNum).findFirst().get());
	}
	
	@Override
	public void FindByUserEmail(String pEmail) {
		return users.stream().filter(s -> s.getEmail()== pEmail).findFirst().get();
	}

	@Override
	public void FilterBySex(Char pSex) {
		return students.stream().filter(s -> s.getSex().contains(pSex)).collect(Collectors.toList());
	}

	
}
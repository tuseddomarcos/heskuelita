

package com.capgemini.heskuelita.beans;

import com.capgemini.heskuelita.beans.Student;
import com.capgemini.heskuelita.services.IStudentDAO;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public abstract class StudentImplTest<Char> implements IStudentService{

	
	private static final ArrayList<Student> students=new ArrayList<Student>();	
	private ContactData CD;
	private static final ArrayList <Course> courses=new ArrayList<Course>();
	private static final ArrayList <User> users=new ArrayList<User>();
	
	
	public void TestStudentDAOImpl() {			
										
						Student stu1 = new Student((long) 1, "julio", "perez", LocalDate.of(1995, 5, 2), "dni", "39178688", 'm', CD = new ContactData( "1165898568", "castelar", "2023", "1706"));		
						Student stu2 = new Student((long) 2, "maria", "blanco", LocalDate.of(1993, 2, 11), "dni", "37171238", 'm', CD = new ContactData("1175656893", "haedo", "1042", "2045"));	
						Student stu3 = new Student((long) 3, "esteban", "quito", LocalDate.of(1985, 5, 1), "dni", "30881688", 'm', CD = new ContactData( "1132121444", "suipacha", "232", "9072"));	
						Student stu4 = new Student((long) 4, "luisa", "malek", LocalDate.of(1999, 8, 8), "dni", "50555898", 'm', CD = new ContactData( "1122266587", "charcas", "111", "2112"));
			
						students.add(stu1, stu2, stu3, stu4);
												
						Course cou1 = new Course((long) 1, "OOP", "Object Orient Programming", 15, 20);
						Course cou2 = new Course((long) 2, "DB", "Database", 12, 20);
						Course cou3 = new Course((long) 3, "HTML5", "HyperText Markup Language", 10 ,20);
						Course cou4 = new Course((long) 4, "Java", "Java Standard Programming", 15,20);
						
						courses.add(cou1, cou2, cou3, cou4);										
			
						User us1 = new User((long) 1, "1234", "jperez@gmail.com", stu1);
						User us2 = new User((long) 2, "112233", "mblanco@hotmail.com", stu2);
						User us3 = new User((long) 3, "4321", "equito@hotmail.com", stu3);
						User us4 = new User((long) 4, "332211", "luisam@gmail.com", stu4);
						
						users.add(us1, us2, us3, us4);
																
	}

	
	public ArrayList<Student> ListAll(){
		return students;
	}
	
	
	public void Add(Student pStudent) {
		students.add(pStudent);
	}
	
	
	public void Edit(Student pStudent) {
		students.remove(students.indexOf(pStudent));
	}
	

	public void DeleteByID(Long pID) {
		students.remove(students.stream().filter(s -> s.getId() == pID).findFirst().get());
	}
	
	
	public Student FindByID(Long pID) {
		return students.stream().filter(s -> s.getId()== pID).findFirst().get();
	}
	
	
	public User FindByUserEmail(String pEmail) {
		return users.stream().filter(u -> u.getUser_email()== pEmail).findFirst().get();
	}

	
	public ArrayList<Student> FilterBySex(char pSex) {
		return (ArrayList<Student>) students.stream().filter(s -> s.getSex() == pSex).collect(Collectors.toList());
	}

	
	
}

package beans;

import java.sql.Date;

public class Student extends Person{
	
	public Student() {
		
	}

	public Student(int id, String name, String lastName, int documentationType, Date birthday, int identification,
			int telephone, String sex, String country, String state, String city, String user_name, int password,
			String sequerityQuestion) {
		
		super(id, name, lastName, documentationType, birthday, identification, telephone, sex, country, state, city, user_name,
				password, sequerityQuestion);
		
	}

	public int getDNI() {
		return this.identification ;
	}

	public String getLastname() {
		return this.lastName ;
	}
}

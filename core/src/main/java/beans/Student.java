package beans;

import java.sql.Date;

public class Student extends Person{
	
	public Student(String name, String lastName,  String user_name,int identification ) {
		super(name, lastName, user_name, identification) ;
	}

	public Student(int id, String name, String lastName, String documentationType, Date birthdate, int identification,
			int telephone, String sex, String country, String state, String city, String user_name, int password,
			String sequerityQuestion) {
		
		super(id, name, lastName, documentationType, birthdate, identification, telephone, sex, country, state, city, user_name,
				password, sequerityQuestion);	
	}

	public int getIdentification() {
		return this.identification ;
	}
	
	public void setIdentification(int identification) {
		this.identification = identification ;
	}

	public String getLastname() {
		return this.lastName ;
	}

	public String getEmail() {
		return this.user_name ;
	}

	public int getTelephone() {
		return this.telephone ;
	}
}

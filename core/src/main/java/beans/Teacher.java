package beans;

import java.sql.Date;

public class Teacher extends Person{

	public Teacher(int id, String name, String lastName, String documentationType, Date birthdate, int identification,
			int telephone, String sex, String country, String state, String city) {
		
		super(id, name, lastName, documentationType, birthdate, identification, telephone, sex, country, state, city);

	}

	public int getIdentification() {
		return this.identification ;
	}

	public String getLastname() {
		return this.lastName ;
	}

}

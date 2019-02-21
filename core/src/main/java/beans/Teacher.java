package beans;

import java.sql.Date;

public class Teacher extends Person{

	public Teacher(int id, String name, String lastName, int documentationType, Date birthday, int identification,
			int telephone, String sex, String country, String state, String city) {
		
		super(id, name, lastName, documentationType, birthday, identification, telephone, sex, country, state, city);

	}

}

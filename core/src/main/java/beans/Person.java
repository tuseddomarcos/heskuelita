package beans;

import java.sql.Date;

public class Person {
	
	protected int id;
	protected String name;
	protected String lastName;
	protected int documentationType;
	protected Date birthday;
	protected int identification;
	protected int telephone;
	protected String sex;
	protected String country;
	protected String state;
	protected String city;
	protected String user_name;
	protected int password;
	protected String sequerityQuestion;

	public Person(int id, String name, String lastName, int documentationType, Date birthday,
			int identification, int telephone, String sex, String country, String state,
			String city, String user_name, int password, String sequerityQuestion) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.documentationType = documentationType;
		this.birthday = birthday;
		this.identification = identification;
		this.telephone = telephone;
		this.sex = sex;
		this.country = country;
		this.state = state;
		this.city = city;
		this.user_name = user_name;
		this.password = password;
		this.sequerityQuestion = sequerityQuestion;
		
	}
	
	public Person() {
	}
	
	public Person(int id, String name, String lastName, int documentationType, Date birthday,
			int identification, int telephone, String sex, String country, String state,
			String city) {
		
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.documentationType = documentationType;
		this.birthday = birthday;
		this.identification = identification;
		this.telephone = telephone;
		this.sex = sex;
		this.country = country;
		this.state = state;
		this.city = city;
		
	}

}

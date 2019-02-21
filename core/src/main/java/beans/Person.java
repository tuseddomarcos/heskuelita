package beans;

import java.sql.Date;

public class Person {
	
	private int id;
	private String name;
	private String lastName;
	private int documentationType;
	private Date birthday;
	private int identification;
	private int telephone;
	private String sex;
	private String country;
	private String state;
	private String city;
	private String user_name;
	private int password;
	private String sequerityQuestion;

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

package beans;

import java.sql.Date;
import java.util.Properties;
import java.util.logging.Logger;

public class Person {
	
	protected int id;
	protected String name;
	protected String lastName;
	protected String documentationType;
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
	
	public Person() {
	}

	public Person(int id, String name, String lastName, String documentationType, Date birthday,
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
	
	public Person(int id, String name, String lastName, String documentationType, Date birthday,
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
	
	
	/**	LO que vimos de LOGGER:
		
import org.apache.log4j.Logger ;
import java.util.Properties ;


		
public class Calc( ) {
		
	public static final Logger log = Logger.getLogger(Calc.class) ;
	
	public static void main (String[] args) {
		Properties pop = new Properties() ;
		pop.load(Calc.class.getClassLoader().getResourceAsStream(name "pop.properties"));
		
		log.info(pop.getProperty("----.name")) ;
	
		StringBuilder p = new StringBuilder() ;
		p.append("Hola") ;
		p.append("Mundo") ;
		
		
		
		
	}**/ 
		
		
}
	

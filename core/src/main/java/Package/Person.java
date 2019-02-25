package Package;

public class Person {

	private int id;
	private char firstName;
	private char lastName;
	private char documentation;
	private int identification;
	private char email;

	public Person(int id, char firstName, char lastName, char documentation, int identification, char email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.documentation = documentation;
		this.identification = identification;
		this.email = email;
	}

	public int getId() {
		return this.id;
	}

	public char getFirstName() {
		return this.firstName;
	}

	public char getLastName() {
		return this.lastName;
	}

	public char getDocumentation() {
		return this.documentation;
	}

	public int getIdentification() {
		return this.identification;
	}

	public char getEmail() {
		return this.email;
	}
}
package com.capgemini;

public abstract class Person extends IDGenerator {

	private String name;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param birthday
	 * @param email
	 * @param sex
	 */
	public Person(String name, Time birthday, String email, char sex) {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

}
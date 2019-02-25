package com.capgemini.heskuelita.beans;


public static void main(String[] args) {
	
	//PERSON
	//Verifying individual constructors of Person 
	Person p = new Person();
	p.SetName("Lucia");
	p.SetLastName ("Gomez");
	p.SetBirthdate ("2012-07-28");
	p.SetDocumentType("DNI");
	p.SetIdentification(61456789);
	p.SetPhone (46985231);
	p.SetSex ("F");
	p.SetCity ("La Plata");
	p.SetAdress ("Cordoba 1864");
	p.SetZipcode (1526);

	System.out.println(GetName);
	System.out.println(GetLastName);
	System.out.println(GetBirthdate);
	System.out.println(GetDocumentType);
	System.out.println(GetIdentification);
	System.out.println(GetPhone);
	System.out.println(GetSex);
	System.out.println(GetCity);
	System.out.println(GetAdress);
	System.out.println(GetZipcode);
	
	//Verifying general constructor of Person 
	Person p2 = new Person ("Carlos","Torres","2002-07-28","DNI", 32165498, 46987512,"M","Capital", "Corrientes 1234", 684);
	
	//STUDENT
	//Verifying individual constructors of Student 
	Student  s = new Student();
	s.SetName("Marta");
	s.SetLastName ("Gomez");
	s.SetBirthdate ("2088-07-28");
	s.SetDocumentType("DNI");
	s.SetIdentification(33456789);
	s.SetPhone (46985231);
	s.SetSex ("F");
	s.SetCity ("La Plata");
	s.SetAdress ("Cordoba 1864");
	s.SetZipcode (1526);
	s.SetId (1);
	
	System.out.println(GetName);
	System.out.println(GetLastName);
	System.out.println(GetBirthdate);
	System.out.println(GetDocumentType);
	System.out.println(GetIdentification);
	System.out.println(GetPhone);
	System.out.println(GetSex);
	System.out.println(GetCity);
	System.out.println(GetAdress);
	System.out.println(GetZipcode);
	System.out.println(GetId);
	
	
	
	
	
	System.out.println(GetName);
	
	
	//Verifying general constructor of Student 
	Person s = new Student ("Jose","Torres","2002-07-28","DNI", 12365489, 46987512,"M","Capital", "Corrientes 1234", 684);
	
	
	
	
}



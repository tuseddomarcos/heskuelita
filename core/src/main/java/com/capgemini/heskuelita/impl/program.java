package com.capgemini.heskuelita.impl;

public class program {

	public static void main(String[] args) throws Exception {
		ConectionFactory n=new ConectionFactory();
		Server a=n.getConection("Postgre");
		
		a.Setup();
		a.Create("Andres", "Petrizzo", " ", 0, 0, " ", " ", 0, 0, " ");
		a.Destroy();

	}

}

package com.capgemini.heskuelita.beans;

import java.util.Collection;
import java.util.HashSet;

public class App {

	public static void main(String[] args) {

		Collection<String> prueba= new HashSet<String>();
		
		prueba.add("Rick");
		prueba.add("Morty");
		prueba.add("Summer");
		prueba.add("Beth");
		prueba.add("Rick");
		
		System.out.println(prueba.isEmpty());
		System.out.println(prueba.size());
		System.out.println(prueba.hashCode());
		System.out.println(prueba.contains("bla"));
		
		for (String e: prueba){
			System.out.println(e);
		}
		
		
		
		
		
	}

}

package com.capgemini.heskuelita.beans;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.log4j.*;

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
		
		List<String> names= Arrays.asList ("raul.pena@gmail.com", "raul.pena@hotmail.com",
				 "homer.simpson@gmail.com", "lisa.simpson@yahoo.com", "bart.simpson@gmail.com");
		
		
		
		
	}
	
	

}

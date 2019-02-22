package com.capgemini.heskuelita.beans;

import java.util.HashSet;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> conjunto = new HashSet<String>();
		conjunto.add("Mario");
		conjunto.add("Elvira");
		// System.out.println(conjunto.size());
		
		// System.out.println(conjunto.isEmpty());
		
		conjunto.add("Jose"); // No se puede agregar con indice
		
		System.out.println(conjunto.contains("Jose"));
		
		conjunto.remove("Jose");
		
		conjunto.add("Jose");
		conjunto.add("Jose");
		System.out.println(conjunto.size());
		
		for (String miembro : conjunto) {
			System.out.println(miembro);
		}

	}

}

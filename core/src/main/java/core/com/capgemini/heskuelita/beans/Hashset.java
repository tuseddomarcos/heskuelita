package core.com.capgemini.heskuelita.beans;

import java.util.HashSet;

public class Hashset {
	public static void main(String[]args) {
		HashSet<String> Conjunto = new HashSet<String>();
		Conjunto.add("Pepe Argento");
		Conjunto.add("Moni Argento");
		Conjunto.add("Fatiga");
		HashSet<String> Conjunto2 = new HashSet<String>();
		System.out.println(Conjunto);
		
		for(String E : Conjunto) {
			System.out.println(E);
		}
		
		if(Conjunto.isEmpty()) {
			System.out.println("El conjunto esta vacio");
		}
		else {
			System.out.println("El conjunto no esta vacio");
		}
		
		if(Conjunto2.isEmpty()) {
			System.out.println("El conjunto2 esta vacio");
		}
		else {
			System.out.println("El conjunto2 no esta vacio");
		}
			
	}
}

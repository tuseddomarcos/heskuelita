package com.capgemini.heskuelita.impl;

//Fabrica de BBDD

public class ConectionFactory {
	private Server server=null;
	
	public Server getConection(String motor) {
		if(motor.equals("MySQL")) {
			server = new ConectionMySQL();
		}
		else if(motor.equals("Postgre")) {
			server = new ConectionPostgre();
		}
		 
		return server;
	}
}

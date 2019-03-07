package com.capgemini.java.web;

//Fabrica de BBDD

public class ConectionFactory {
	private IConectionServer server=null;
	
	public IConectionServer getConection(String motor) {
		if(motor.equals("MySQL")) {
			server = new ConectionMySQL();
		} 
		else if(motor.equals("Postgre")) {
			server = new ConectionPostgre();
		}
		 
		return server; 
	}
}

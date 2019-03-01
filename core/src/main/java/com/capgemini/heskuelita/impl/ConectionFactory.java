package com.capgemini.heskuelita.impl;

import core.com.capgemini.heskuelita.service.IConectionServer;

public class ConectionFactory {
	IConectionServer server=null;
	
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

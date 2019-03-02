package com.capgemini.heskuelita.impl;

import core.com.capgemini.heskuelita.service.IConectionServer;

public class program {

	public static void main(String[] args) throws Exception {
		ConectionFactory n=new ConectionFactory();
		IConectionServer a=n.getConection("Postgre");
		
		a.Setup();
		a.Create(" ", " ", " ", 0, 0, " ", " ", 0, 0, " ");
		a.Read();
		a.Destroy();
		
	}

}

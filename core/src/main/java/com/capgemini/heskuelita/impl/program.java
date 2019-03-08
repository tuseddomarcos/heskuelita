package com.capgemini.heskuelita.impl;

import org.apache.log4j.PropertyConfigurator;

import core.com.capgemini.heskuelita.service.IConectionServer;

public class program {

	public static void main(String[] args) throws Exception {
		
		//instancio la fabrica para crear una conexion
		ConectionFactory newConecction=new ConectionFactory();
		
		//Conecto mi fabrica a la base de datos
		//este objeto solo posee la habiladad de conecctarse y desconectarce de una base de datos
		//posee un metod get para retornar dicha conexion
		IConectionServer conecction=newConecction.getConection("Postgre");
		
		//Este objeto enapsula los metodos de Create, Road, Update y Delete que se puedan aplicar a cualquie base de datos
		CrudAbstractImpl crud=new CrudPostgre();
		
		conecction.Setup();
		crud.Create(conecction.getDataSource(), "Victor", "Perez", "Dni", 2365412, 42748149, "M", "Blabkaak", 1100, 1888, "dbkjh@sdlksd.com");
		crud.Read(conecction.getDataSource(), "stu_id, stu_name", "student", "stu_name = 'Victor'");
		crud.Update(conecction.getDataSource(), "stu_name", "student", "stu_id>60", " ");
		crud.Delete(conecction.getDataSource(), "student");
		conecction.Destroy();
		 
	}

}

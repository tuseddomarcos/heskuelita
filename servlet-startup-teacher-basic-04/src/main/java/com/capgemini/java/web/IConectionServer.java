package com.capgemini.java.web;

import org.apache.commons.dbcp2.BasicDataSource;

//Interfaz para la fabrica de BBDD
public interface IConectionServer {
	public void Setup () throws Exception;
	public void Destroy () throws Exception;
	
	public BasicDataSource getDataSource();
	public void setDataSource(BasicDataSource dataSource);

}

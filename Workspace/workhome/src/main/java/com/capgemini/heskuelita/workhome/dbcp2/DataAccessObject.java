package com.capgemini.heskuelita.workhome.dbcp2;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;



public class DataAccessObject {
	protected BasicDataSource dataSource;
	
	public DataAccessObject() {
		// TODO Auto-generated constructor stub
		super();
		this.dataSource = new BasicDataSource();
	}
	
	//Conecto con la base de datos
	public void ConnectDatabase() throws SQLException {
		//configuro  la direccion de la base de datos
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		//seteo username y password de la base de datos
		dataSource.setUsername("postgres");
		dataSource.setPassword("hugo0412");
	}
	
	//Libero recurso de la base de datos
	public void destroy() throws SQLException {
		dataSource.close();
	}
	
	public BasicDataSource getDataSource() {
		return dataSource;
	}
}

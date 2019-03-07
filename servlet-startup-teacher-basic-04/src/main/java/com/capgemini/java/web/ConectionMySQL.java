package com.capgemini.java.web;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;



public class ConectionMySQL implements IConectionServer{

	protected BasicDataSource dataSource = new BasicDataSource();

	// Logger object.
	protected static final Logger logger = Logger.getLogger (ConectionMySQL.class);

	public ConectionMySQL() {

	}

	public void Setup() {
		try {
			// Create a new Datasource.
			this.dataSource = new BasicDataSource ();

			dataSource.setUrl("jdbc:mysql://localhost:3306/Practica2"+"?useTimezone=true&serverTimezone=UTC");
			dataSource.setUsername ("root");
			dataSource.setPassword ("1234");
			dataSource.setMinIdle (5);
			dataSource.setMaxIdle (10);
			dataSource.setMaxOpenPreparedStatements (100);

			logger.debug("Connected to database");


		}catch (Exception e){

		}
	}

	public BasicDataSource getDataSource() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDataSource(BasicDataSource dataSource) {
		// TODO Auto-generated method stub
		
	}

	public void Destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}



}

package com.capgemini.heskuelita.impl;

import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

import core.com.capgemini.heskuelita.service.IConectionServer;

public class ConectionPostgre implements IConectionServer{
	
	protected BasicDataSource dataSource = new BasicDataSource();
	
	// Logger object.
	protected static final Logger logger = Logger.getLogger (ConectionPostgre.class);
	
	public ConectionPostgre() {
	} 
 
 
	public void Setup() {
		try { 
			// Create a new Datasource.
	        this.dataSource = new BasicDataSource ();

	        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
	        dataSource.setUsername ("postgres");
	        dataSource.setPassword ("andres");
	        dataSource.setMinIdle (5);
	        dataSource.setMaxIdle (10);
	        dataSource.setMaxOpenPreparedStatements (100);
	        
	        logger.debug("Connected to database");
	        
	          
		}catch (Exception e){
			
		}
		
	}

	public void Destroy() throws SQLException {
		this.dataSource.close ();
        logger.debug("Connected to finalized database");
		
	}


	public BasicDataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}

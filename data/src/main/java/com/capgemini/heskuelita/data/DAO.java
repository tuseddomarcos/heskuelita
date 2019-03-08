package com.capgemini.heskuelita.data;

import org.apache.commons.dbcp2.BasicDataSource;

public abstract class DAO {

    private BasicDataSource dataSource;
	
    public DAO() {
    	super();
    }
    
    public void setUp() throws Exception{
    	
    	this.dataSource= new BasicDataSource();
    	
    	dataSource.setUrl("jdbc:postgresql://localhost:5432/escuela");
    	dataSource.setUsername("postgres");
    	dataSource.setPassword("ramapost");
        dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
    }
    
    public void destroy () throws Exception {

        this.dataSource.close ();
    }

	public BasicDataSource getDataSource() {
		return dataSource;
	}
    
}

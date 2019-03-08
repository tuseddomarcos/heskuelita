package com.capgemini.java.web;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;;


public class DataBaseAccess {
	
	private BasicDataSource dataSource;
	
	public DataBaseAccess() {
		super();
		this.dataSource= new BasicDataSource();
	}
	
	public void registerPerson(Person p) throws SQLException  {
		setUp();
		
		PreparedStatement pstm;
	
		pstm = dataSource.getConnection().prepareStatement("INSERT INTO public.\"PERSON\" (name, lastname, address, gender, job, experience) VALUES(DEFAULT, ?, ?, ?, ?, ?, ?)");
		pstm.setString(2, p.getName());
		pstm.setString(3, p.getLastname());
		pstm.setString(4, p.getAddress());
		pstm.setString(5, p.getGender());
		pstm.setString(6, p.getJob());
		pstm.setString(7, p.getExperience());
			
		int r= pstm.executeUpdate();
			
		dataSource.close();
		
			// TODO Auto-generated catch block
	}
	
	private void setUp() {
		this.dataSource = new BasicDataSource ();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/Test");
        dataSource.setUsername ("postgres");
        dataSource.setPassword ("hugo0412");
        dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
	}
}

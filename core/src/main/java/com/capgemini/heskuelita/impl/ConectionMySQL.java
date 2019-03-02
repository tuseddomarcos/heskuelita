package com.capgemini.heskuelita.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Assert;

import core.com.capgemini.heskuelita.service.IConectionServer;

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

	public void Create(String name, String last_name, String doc_type, int doc_num, int phone, String sex,
			String screet, int screet_number, int zip_code, String email) throws Exception {
		// TODO Auto-generated method stub

	}


	public void Destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	public void Read() throws Exception {
		// TODO Auto-generated method stub

	}

	public void Update() throws Exception {
		// TODO Auto-generated method stub

	}

	public void Delete() throws Exception {
		// TODO Auto-generated method stub

	}
	private void writeResult (ResultSet rs) throws SQLException{
		// ResultSet is initially before the first data set
		while (rs.next ()) {

			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring (2);

			logger.info(rs.getString (1)+" "+rs.getString (2)+" "+rs.getString (3));
		}
	}



}

package com.capgemini.heskuelita.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

public abstract class Server {
	
	protected BasicDataSource dataSource = new BasicDataSource();
	
	// Logger object.
	protected static final Logger logger = Logger.getLogger (Server.class);
	
	public abstract void Create (
			String name,
			String last_name,
			String doc_type,
			int doc_num,
			int phone,
			String sex,
			String screet,
			int screet_number,
			int zip_code,
			String email) throws Exception;
	
	public abstract void Read () throws Exception;
	public abstract void Update () throws Exception;
	public abstract void Delete () throws Exception;
	public abstract void writeResult (ResultSet rs) throws SQLException;
}

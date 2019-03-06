package com.capgemini.heskuelita.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Assert;

public abstract class ReadImplABS{
	private final Logger logger = Logger.getLogger (ReadImplABS.class);
	
	
	public ReadImplABS(BasicDataSource dataSource, String campo, String tabla, String condicion) {
		try{
			Read(dataSource, campo, tabla, condicion);
		}catch(Exception e) {
			logger.fatal("Parametro mal ingresado");
			e.printStackTrace ();
		}
	}


	private void Read(BasicDataSource dataSource, String campo, String tabla, String condicion) throws SQLException {
		try {
			Statement stm = dataSource.getConnection().createStatement();
			// Result set get the result of the SQL query
			ResultSet resultSet = stm.executeQuery ("SELECT "+campo+" from "+tabla+" WHERE "+condicion);

			// Print the messages.
			writeResult (resultSet);

		} catch (Exception e) {

			e.printStackTrace ();
			Assert.assertTrue ("Failure executing Insert...", e == null);

		}
	}

	private void writeResult (ResultSet rs) throws SQLException {

		// ResultSet is initially before the first data set
		while (rs.next ()) {

			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring (2);

			logger.info(rs.getString (1)+" "+rs.getString (2));//+" "+rs.getString (3));

		}
	}
}

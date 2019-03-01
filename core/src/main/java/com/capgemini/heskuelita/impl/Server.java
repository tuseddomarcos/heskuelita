package com.capgemini.heskuelita.impl;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

public abstract class Server {
	
	protected BasicDataSource dataSource = new BasicDataSource();
	
	// Logger object.
	protected static final Logger logger = Logger.getLogger (Server.class);
	
}

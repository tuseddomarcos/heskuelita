package com.capgemini.heskuelita.impl;

import org.apache.commons.dbcp2.BasicDataSource;

public class BuscarPorNombre extends ReadImplABS {

	public BuscarPorNombre(BasicDataSource dataSource, String campo, String tabla, String condicion) {
		super(dataSource, campo, tabla, condicion);
	}

}

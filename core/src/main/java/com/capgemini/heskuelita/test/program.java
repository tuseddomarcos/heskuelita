package com.capgemini.heskuelita.test;

public class program {

	public static void main(String[] args) throws Exception {
		DataSourceTest base = new DataSourceTest();
		base.setup();
		
		
		base.testRead();
		
		base.destroy();

	}

}

package com.capgemini.heskuelita.beans;
import java.sql.*;


public class SimpleCon 
{
	
	public void primerTest() 
	{
		
try {
		
		System.out.println("Test de conexion");
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heskuelita", "root","1234");
		System.out.println("Conectado");	
		
		Statement estado=con.createStatement();
		ResultSet resultado=estado.executeQuery("select * from person");
		
		System.out.println("id \t firstname \t lastname \t gender \t phone \t email \t active \t");
		while (resultado.next()) {
			System.out.println(resultado.getInt("id"));
			
		}
		
		
		}
	catch (SQLException e) 
	{		
		
	System.out.println("Error 1 mysql");	
	System.out.println("Error: "+e.getMessage());
	}

	catch (ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	catch (Exception e)
	{
		System.out.println("Error: "+e.getMessage());
		
		
	}
	

}
}

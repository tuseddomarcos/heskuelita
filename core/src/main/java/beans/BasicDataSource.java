package beans;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.util.PSQLException;

public class BasicDataSource {
	
	public static void main (String[] args) throws SQLException {
		
	final String driver = "org.postgresql.Driver" ;
	final String URL = "jdbc:postgresql://127.0.0.1/Heskuelita" ;
	final String username = "root" ;
	final String pass = "868548tan" ;
	final String minIdle = "5" ;
	final String maxIdle = "10" ;
	final String maxOpenPreparedStatements = "100" ;
	Connection conn = null ; 
	
	
	try { 
		//************************************************************************* 
		// Se realiza la conexión a la Base de Datos tomando los datos anteriormente definidos* 
		//************************************************************************* 
		
		Class.forName(driver);
		Statement statement = (Statement) conn.createStatement();
		
		ResultSet result = statement.executeQuery(select*from classroom) ;
		int i = 1 ;
		while (result.next()) {
			System.out.println("0" + i + " - " + result.getInt("id") + "  " + result.getString(2));
			i ++ ;
		}
        

	} catch (Exception e) {
       e.printStackTrace();
	} finally {
		if (conn != null) {
			try {
				conn.close() ;
			} catch (SQLException e) {
				e.printStackTrace();
				}
			}
	}
	
	}
	
}
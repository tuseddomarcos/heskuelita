package com.capgemini.heskuelita.test;

import org.junit.*;

import com.capgemini.heskuelita.impl.ConectionFactory;
import com.capgemini.heskuelita.impl.ConectionPostgre;

import core.com.capgemini.heskuelita.service.IConectionServer;

import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import static org.apache.commons.lang3.RandomStringUtils.*;

public class DataSourceTest {
	
	private BasicDataSource dataSource;
	
	private ConectionFactory newConection=new ConectionFactory();

	// Logger object.
	public static final Logger logger = Logger.getLogger (DataSourceTest.class);


	@Before
    public void setup () throws Exception {

		try {
			// Create a new Datasource.
	        this.dataSource = new BasicDataSource ();

	        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
	        dataSource.setUsername ("postgres");
	        dataSource.setPassword ("andres");
	        dataSource.setMinIdle (5);
	        dataSource.setMaxIdle (10);
	        dataSource.setMaxOpenPreparedStatements (100);
	        
	         
		}catch (Exception e){
			
		}
        
    }

	@Test
    public void testCreate () {

        try {
       

            PreparedStatement pstm = this.dataSource.getConnection ().prepareStatement 
            		("INSERT INTO student VALUES (default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pstm.setString (1, randomAlphabetic (9));
            pstm.setString (2, randomAlphabetic (10));
            pstm.setString (3, randomAlphabetic (3));
            pstm.setInt (4, (Integer.parseInt(randomNumeric (5))));
            pstm.setInt (5, (Integer.parseInt(randomNumeric (8))));
            pstm.setString (6, randomAlphabetic (1));
            pstm.setString (7, randomAlphabetic (15));
            pstm.setInt (8, (Integer.parseInt(randomNumeric (4))));
            pstm.setInt (9, (Integer.parseInt(randomNumeric (4))));
            pstm.setString (10, randomAlphabetic (15));
         
            // Execute the insert.
            int r = pstm.executeUpdate ();
 
        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
            
        }
    }
    
	@Test
    public void testDelete () {

        try {

            PreparedStatement stm = this.dataSource.getConnection ().prepareStatement 
            		("DELETE FROM student");
            int r = stm.executeUpdate ();


        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }
    
	@Test
    public void testUpdate () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();

            int r = stm.executeUpdate 
            		("UPDATE student SET stu_name='Andres', stu_last_name='Petrizzo' "
            				+ "WHERE stu_id='3'");

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
            
        }
    }
    
	@Test
    public void testRead () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();

            // Result set get the result of the SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * from student");

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
        	
        	logger.info(rs.getString (1)+" "+rs.getString (2)+" "+rs.getString (3));

        }
    }
    
    @Test
    public void TestConectionFactory() throws Exception {
    	
    	//a es el valor a comparar, b es el valor esperado;
    	IConectionServer a = newConection.getConection("Postgre");
    	IConectionServer b = new ConectionPostgre();
    	
    	//¿Por qué solo me funciona con getClass y no solo con .equals
    	if (a.getClass().equals(b.getClass())) {
    		logger.info("OK");
    		 
    		//Probando metodos
    		a.Setup();
        	a.Destroy();
    	}
    	
    }
    
    @After
    public void destroy () throws Exception {

        this.dataSource.close ();
    }

}



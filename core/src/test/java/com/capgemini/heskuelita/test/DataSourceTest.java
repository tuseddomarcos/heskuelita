package com.capgemini.heskuelita.test;

import org.junit.*;
import java.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import static org.apache.commons.lang3.RandomStringUtils.*;

public class DataSourceTest {
	
	private BasicDataSource dataSource;
	
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
	        
	        logger.debug("Connected to database");
	        
	        
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
            
        }
    }
    
	@Test
    public void testRead () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();

            // Result set get the result of the SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * from course");

            // Print the messages.
            writeResult (resultSet);

        } catch (Exception e) {

            e.printStackTrace ();
            
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
    
    @After
    public void destroy () throws Exception {

        this.dataSource.close ();
        logger.debug("Connected to finalized database");
    }

}



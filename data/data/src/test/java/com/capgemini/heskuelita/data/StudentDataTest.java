package com.capgemini.heskuelita.data;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.*;
import static org.apache.commons.lang3.RandomStringUtils.*;

public class StudentDataTest {

    private BasicDataSource dataSource;
    private static final Logger logger= Logger.getLogger(StudentDataTest.class);
    
    public StudentDataTest() {
    	super();
    }
	
    
    private void writeResult(ResultSet rs) throws SQLException {
    	
    	while(rs.next()) {
    		
    		String name= rs.getString("name");
    		String surname= rs.getString("surname");
    		int dni= rs.getInt("dni");
    		
    	}
    }
    
    @Before
    public void setUp() throws Exception{
    	
    	this.dataSource= new BasicDataSource();
    	
    	dataSource.setUrl("jdbc:postgresql://localhost:5432");
    	dataSource.setUsername("postgres");
    	dataSource.setPassword("ramapost");
        dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
    }
    
    @Test
    public void testRead() {
    	
    	try {
    		Statement stm= this.dataSource.getConnection().createStatement();
    		ResultSet resulSet= stm.executeQuery("SELECT * from public.Person");
    		
    		Assert.assertTrue("The table is  empty", resulSet.isBeforeFirst());

    	}
    	catch (Exception e) {
    		
            e.printStackTrace ();
            Assert.assertTrue ("Failure executing SELECT Into Person", e == null);
    	}
    }
    
    
    
}

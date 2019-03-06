package app;
import org.apache.log4j.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class DBTeacher{
	
	 private void writeResult (ResultSet rs) throws SQLException {

	        while (rs.next ()) {
	        	
	        	
	        	Integer id = rs.getInt("id");
	            String first_name   = rs.getString ("first_name");
	            String last_name  = rs.getString ("last_name");
	            String gender = rs.getString ("gender");
	            Integer age = rs.getInt ("age");
	            String doc_type = rs.getString("doc_type");
	            Integer identification = rs.getInt("identification");
	            Integer phone = rs.getInt("phone");
	            String email = rs.getString ("email");
	            
	            logger.info (String.format ("Id: %s", id));
	            logger.info (String.format ("Name: %s", first_name));
	            logger.info (String.format ("Last Name: %s", last_name));
	            logger.info (String.format ("Gender: %s", gender));
	            logger.info (String.format ("Age: %s", age));
	            logger.info (String.format ("Doc Type: %s", doc_type));
	            logger.info (String.format ("Identification: %s", identification));
	            logger.info (String.format ("Phone: %s", phone));
	            logger.info (String.format ("Email: %s", email));
	            System.out.println("***********************************************");
	        }
	    }
	
	private BasicDataSource dataSourceTest;
	
	private static final Logger logger = Logger.getLogger (DBTeacher.class);
	
	public DBTeacher() {
		super();
	}
	
	
	 @Before
	    public void setup () throws Exception {

	        // Create a new Data source.
	        this.dataSourceTest = new BasicDataSource ();

	        dataSourceTest.setUrl("jdbc:postgresql://localhost:5432/heskuelita");
	        dataSourceTest.setUsername ("postgres");
	        dataSourceTest.setPassword ("derqui97");
	        dataSourceTest.setMinIdle (5);
	        dataSourceTest.setMaxIdle (10);
	        dataSourceTest.setMaxOpenPreparedStatements (100);
	    }
	 
	 
	 
	 @Test
	    public void testAddNewTeacher () {

	        try {
	        	
	        	Scanner in= new Scanner (System.in);
	        	Scanner ans= new Scanner (System.in);
	        
	        	
	        	System.out.println("Do you want to add a new teacher? (yes/no)");
	        	
	        	String answer=ans.nextLine();
	        	
	        	if (answer.equals("yes")) {
	        		
	        	System.out.println ("Enter the teacher´s name:"); String first_name=in.nextLine();
	        	System.out.println ("Enter the teacher´s last name:"); String last_name=in.nextLine();
	        	System.out.println ("Gender:"); String gender=in.nextLine();
	        	System.out.println ("Age:"); Integer age = in.nextInt();
	        	System.out.println ("Documentation Type:"); String doc_type=ans.nextLine();
	        	System.out.println ("Identification:"); Integer identification= in.nextInt();
	        	System.out.println ("Phone:"); Integer phone= in.nextInt();
	            System.out.println ("Email:"); String email = ans.nextLine();

	            PreparedStatement pstm = this.dataSourceTest.getConnection ().prepareStatement ("INSERT INTO public.teacher(first_name, last_name, gender, age, doc_type, identification, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?,?);");

	            pstm.setString (1, first_name);
	            pstm.setString (2, last_name);
	            pstm.setString (3, gender );
	            pstm.setInt    (4, age); 
	            pstm.setString (5, doc_type);
	            pstm.setInt    (6, identification);
	            pstm.setInt    (7, phone);
	            pstm.setString (8, email);
	            
	            int r = pstm.executeUpdate ();
	            
	            System.out.println("Teacher "+first_name+" "+ last_name+ " was added succesfully");
	        	
	            Assert.assertTrue ("The teacher could not be registered", r > 0);
	        	
	        	}
	       
	        } 
	        
	        
	        
	        catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing Insert", e == null);
	        }
	    }
	 
	    @Test
	    public void testShowCurrentTeachers () {

	        try {

	            Statement stm = this.dataSourceTest.getConnection ().createStatement ();

	            ResultSet resultSet = stm.executeQuery ("SELECT * FROM public.teacher");

	            Assert.assertTrue("The tables is empty", resultSet.isBeforeFirst ());
	            
	            System.out.println("Currently added teachers:");
	            
	            writeResult (resultSet);

	        } 
	        
	        
	        catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("Failure executing SELECT", e == null);
	        }
	    }
	    
	   
	    @Test
	    public void searchMaleTeachers () {
	    	
	    	try {
	    		
	            Statement stm = this.dataSourceTest.getConnection ().createStatement ();

	            
	            ResultSet resultSet = stm.executeQuery ("SELECT first_name, last_name, gender FROM public.teacher");
	    		
	            System.out.println("The male teachers are: ");
	    		
	            while (resultSet.next() ) { 
	            	
	            	if(resultSet.getString("gender").contains("M")) {
	            	
	            	   System.out.println(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
	            	   System.out.println("***************************************");
	                              
	            			}
	            	
	            	
	            	}

	    		
	    	}
	    	
	    	catch (Exception e) {

	            e.printStackTrace ();
	            Assert.assertTrue ("There is no male teachers", e == null);
	        }
	    }
	 
	 
	 @After
	    public void destroy () throws Exception {

	        this.dataSourceTest.close ();
	    }
	
}

 


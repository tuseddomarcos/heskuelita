package app;
import org.apache.log4j.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.apache.commons.lang3.RandomStringUtils.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;




public class DbTest {
	
	int randomAge=  ThreadLocalRandom.current().nextInt(18,121);
	int randomIdentification= ThreadLocalRandom.current().nextInt(12345678,99999999);
	int randomPhone= ThreadLocalRandom.current().nextInt(123456789,999999999);
	String [] randomGender= { "M", "F","Other"};
	Random randGender=new Random ();
	int selectRandomGender=randGender.nextInt(randomGender.length);
	
	private BasicDataSource dataSourceTest;
	
	private static final Logger logger = Logger.getLogger (DbTest.class);
	
	public DbTest() {
		super();
	}

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
	            String email   = rs.getString ("email");
   
	            logger.info (String.format ("Id: %s", id));
	            logger.info (String.format ("Name: %s", first_name));
	            logger.info (String.format ("Last Name: %s", last_name));
	            logger.info (String.format ("Gender: %s", gender));
	            logger.info (String.format ("Age: %s", age));
	            logger.info (String.format ("Doc Type: %s", doc_type));
	            logger.info (String.format ("Identification: %s", identification));
	            logger.info (String.format ("Phone: %s", phone));
	            logger.info(String.format("Email: %s", email));
	            System.out.println("***********************************************");
	     
	        }
	    }
	
    @Before
    public void setup () throws Exception {

        // Create a new Data Source.
        this.dataSourceTest = new BasicDataSource ();

        dataSourceTest.setUrl("jdbc:postgresql://localhost:5432/heskuelita");
        dataSourceTest.setUsername ("postgres");
        dataSourceTest.setPassword ("derqui97");
        dataSourceTest.setMinIdle (5);
        dataSourceTest.setMaxIdle (10);
        dataSourceTest.setMaxOpenPreparedStatements (100);
    }
   
    @Test
    public void testRandomInsert () {

        try {

            PreparedStatement pstm = this.dataSourceTest.getConnection ().prepareStatement ("INSERT INTO public.student(first_name, last_name, gender, age, doc_type, identification, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?,?);");
            //Insert random info.
            pstm.setString (1, randomAlphabetic (10));
            pstm.setString (2, randomAlphabetic (20));
            pstm.setString (3, randomGender[selectRandomGender] );
            pstm.setInt    (4, randomAge); 
            pstm.setString (5, randomAlphabetic (3));
            pstm.setInt    (6, randomIdentification);
            pstm.setInt    (7, randomPhone);
            pstm.setString (8, randomAlphabetic (9)+"@gmail.com");
            
            //Execute the insert.
            int r = pstm.executeUpdate ();
            
            Assert.assertTrue ("Failure executing Insert", r > 0);
          
            
            Statement stm = this.dataSourceTest.getConnection ().createStatement ();

            // Using the result set to get the result of the Insert SQL query
            ResultSet resultSet = stm.executeQuery ("SELECT * FROM public.student");

            Assert.assertTrue("The tables is empty", resultSet.isBeforeFirst ());

            // Print just added info.
            
            System.out.println("The table after de insert and before the UPDATE/delete:");
            writeResult (resultSet);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);

        }
    }
    
  
    @Test
    public void testDeleteUpdate () {

        try {

        	//UPDATE
        	
            Statement stm = this.dataSourceTest.getConnection ().createStatement ();
            
            //Execute the UPDATE query.
            int r = stm.executeUpdate ("UPDATE public.student SET  first_name='Rafael', last_name='Acosta', gender='M', age=21, doc_type='DNI', identification=94059075, phone=1164794928, email='acosta.rafael897@gmail.com'");

            Assert.assertTrue ("Fail in the UPDATE", r > 0);
            
            Statement stm2 = this.dataSourceTest.getConnection ().createStatement ();

            // Getting the result of the UPDATE SQL query
            ResultSet resultSet = stm2.executeQuery ("SELECT * FROM public.student");

            Assert.assertTrue("The tables is empty !!!", resultSet.isBeforeFirst ());

            System.out.println("The table after the UPDATE:");
            // Print the updated table.
            writeResult (resultSet);
            
            //DELET
            
            PreparedStatement stm3 = this.dataSourceTest.getConnection ().prepareStatement ("DELETE FROM public.student;");
            
            //Execute the Delete query.
            int r3 = stm3.executeUpdate ();
           
            System.out.println("Finally, we delete the table.");
            
            Assert.assertTrue("Failure executing Delete !!!", r3 > 0);

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Update", e == null);
        }
    }

   
    @After
    public void destroy () throws Exception {

        this.dataSourceTest.close ();
    }


}


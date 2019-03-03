package profesorPackage;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import java.sql.*;



public class DataSourceTest {


    private BasicDataSource dataSource;


    // Logger object.
    private static final Logger logger = Logger.getLogger (DataSourceTest.class);


    public DataSourceTest() {

        super ();
    }


    private void mostrarResultados (ResultSet rs) throws SQLException {

        // ResultSet is initially before the first data set
        while (rs.next ()) {

            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring (2);
            String nom = rs.getString (2);
            String apl   = rs.getString (3);
            String dni = rs.getString (4);
            String tel = rs.getString (5);
            String dir = rs.getString (6);
            String sex = rs.getString (7);
            
            logger.info (String.format ("Nombre: %s", nom));
            logger.info (String.format ("Apellido: %s", apl));
            logger.info (String.format ("Dni: %s", dni));
            logger.info (String.format ("Telefono: %s", tel));
            logger.info (String.format ("Direccion: %s", dir));
            logger.info (String.format ("Sexo: %s", sex));
        }
    }


    @Before
    public void setup () throws Exception {

        // Create a new Datasource.
        this.dataSource = new BasicDataSource ();

        dataSource.setUrl("jdbc:postgresql://localhost:5432/heskuelita");
        dataSource.setUsername ("postgres");
        dataSource.setPassword ("4621");
        dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
    }

    
    public void insertarDato () {

        try {

            PreparedStatement pstm = this.dataSource.getConnection ().prepareStatement ("INSERT INTO student VALUES (default, ?, ?, ?, ?, ?,?)");

            pstm.setString (1, "hola");
            pstm.setString (2, "mundo");
            pstm.setInt (3, 111);
            pstm.setInt (4, 111);
            pstm.setString (5, "rr");
            pstm.setString (6, "r");

            // Execute the insert.
            pstm.executeUpdate ();

        } catch (Exception e) {

            e.printStackTrace ();
            Assert.assertTrue ("Failure executing Insert...", e == null);
        }
    }

    
    public void leerTabla () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();
           
            ResultSet resultSet = stm.executeQuery ("SELECT * from comments");
    
            mostrarResultados (resultSet);

        } catch (Exception e) {

            e.printStackTrace ();
        }
    }

   
    public void modificar () {

        try {

            Statement stm = this.dataSource.getConnection ().createStatement ();
            stm.executeUpdate ("UPDATE comments SET summary = '--'");

            
        } catch (Exception e) {

            e.printStackTrace ();
        }
    }

    public void eliminar () {

        try {
            PreparedStatement stm = this.dataSource.getConnection ().prepareStatement ("DELETE FROM comments");
            stm.executeUpdate ();
           
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

  
}
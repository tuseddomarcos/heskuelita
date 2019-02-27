package dbtesting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;

public class DataSourcePractice {
	
	// Declaramos la dataSource y el Logger
	private BasicDataSource dataSource;
	private static final Logger logger = Logger.getLogger(DataSourcePractice.class);
	
	// Constructor. De que hereda?
	public DataSourcePractice() {
		super();
	}
	
	// Muestra los campos
	private void showresult(ResultSet resultSet) throws SQLException {
		// Mientras exista un siguiente?
		while(resultSet.next()) {
//			String idStu = resultSet.getString("id");
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			String dni = resultSet.getString("dni");
			String phone = resultSet.getString("phone");
			String address = resultSet.getString("address");
			String gender = resultSet.getString("gender");
			
//			logger.info(String.format("ID: %s", idStu));
			logger.info(String.format("First name: %s", firstName));
			logger.info(String.format("Last name: %s", lastName));
			logger.info(String.format("DNI: %s", dni));
			logger.info(String.format("Phone number: %s", phone));
			logger.info(String.format("Address: %s", address));
			logger.info(String.format("Gender: %s", gender));
		}
	}
	
	// Setea la conexion y todas esas cosas
	public void setup() throws Exception {
		// Crea un nuevo Datasource
		this.dataSource = new BasicDataSource();
		
		// Los primeros setean url, usuario y contrasena de postgres. Los
		// otros tres por ahora por defecto asi
		dataSource.setUrl("jdbc:postgresql://localhost:5432/heskuelita");
		dataSource.setUsername("postgres");
		dataSource.setPassword("mhfu17");
		dataSource.setMinIdle (5);
        dataSource.setMaxIdle (10);
        dataSource.setMaxOpenPreparedStatements (100);
	}
	
	// Agrega un estudiante
	public void addStudent() {
		try {
			PreparedStatement prepStm = this.dataSource.getConnection().prepareStatement("INSERT INTO student VALUES (default, ?, ?, ?, ?, ?, ?)");
			
			// Pide los datos
			System.out.println("INTRODUZCA NOMBRE DEL ESTUDIANTE:");
			String nombre = Execute.entrada.nextLine();
			System.out.println("INTRODUZCA APELLIDO DEL ESTUDIANTE:");
			String apellido = Execute.entrada.nextLine();
			System.out.println("INTRODUZCA DIRECCION DEL ESTUDIANTE:");
			String direccion = Execute.entrada.nextLine();
			System.out.println("INTRODUZCA DNI DEL ESTUDIANTE:");
			String dni = Execute.entrada.nextLine();
			System.out.println("INTRODUZCA TELEFONO DEL ESTUDIANTE:");
			String telefono = Execute.entrada.nextLine();
			System.out.println("INTRODUZCA GENERO DEL ESTUDIANTE (M/F):");
			String sexo = Execute.entrada.nextLine();
			
			prepStm.setString(1, nombre);
			prepStm.setString(2, apellido);
			prepStm.setString(3, dni);
			prepStm.setString(4, telefono);
			prepStm.setString(5, direccion);
			prepStm.setString(6, sexo);
			
			// Ejecuta el insert
			prepStm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Muestra los registros de la tabla
	public void showRegisters() {
		try {
			Statement stm = this.dataSource.getConnection().createStatement();
			
			ResultSet resultSet = stm.executeQuery("SELECT * FROM student");
			
			// Muestra los mensajes
			showresult(resultSet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Actualiza DNI del estudiante
	public void updateStudent() {
		try {
			Statement stm = this.dataSource.getConnection().createStatement();
			
			stm.executeUpdate("UPDATE student SET phone = '1234567'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Borra un estudiante de la tabla por DNI
	public void deleteStudentDataByDni () {
		try {
			System.out.println("INGRESE EL DNI DEL ESTUDIANTE:");
			String dni = Execute.entrada.nextLine();
			
			PreparedStatement prepStm = this.dataSource.getConnection().prepareStatement("DELETE FROM student WHERE dni = '" + (String) dni + "'");
			prepStm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void startOpt() {
		int continuar = 1;
		
		while(continuar == 1) {
			System.out.println("QUE FUNCION DESEA EJECUTAR?\n1- AGREGAR\n2- REMOVER\n3- ACTUALIZAR\n4- MOSTRAR ESTUDIANTES");
			int input = Execute.entrada.nextInt();
			
			if (input == 1) {
				Execute.entrada.nextLine();
				addStudent();
			} else if (input == 2) {
				Execute.entrada.nextLine();
				deleteStudentDataByDni();
			} else if (input == 3) {
				Execute.entrada.nextLine();
				updateStudent();
			} else {
				Execute.entrada.nextLine();
				showRegisters();
			}
			
			System.out.println("\n\nDESEA REALIZAR OTRA OPERACION?\n1- Si\n2- No");
			continuar = Execute.entrada.nextInt();
			Execute.entrada.nextLine();
		}
		
	}
	

}

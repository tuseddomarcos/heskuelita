package profesorPackage;

public class AppDataBase {
 public static void main(String[] args) throws Exception {
	 
	 DataSourceTest aplicacion = new DataSourceTest();
	 aplicacion.setup();
	 aplicacion.insertarDato();
 }
}

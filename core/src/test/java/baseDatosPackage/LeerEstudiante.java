package baseDatosPackage;

public class LeerEstudiante {
	public static void main(String[] args) throws Exception {
		 
		 InteractionDB aplicacion = new InteractionDB();
		 aplicacion.setup();
		 aplicacion.leerTabla();
	 }
}

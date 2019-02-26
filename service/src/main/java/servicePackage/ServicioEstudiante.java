package servicePackage;
import javaPackage.Persona_Estudiante;
public interface ServicioEstudiante {
void add(Persona_Estudiante estudiante);
Persona_Estudiante findById(int id);
}

package core.com.capgemini.heskuelita.beans;

import java.util.*;

public class Course extends Component {


    private String name;

    private String description;
    
    private List<Student> lista;
    
    private int capacidad;
    
    private int registrados = 0;


    public Course (Long id, String name, String description, int capacidad) {

        super (id);

        this.name = name;
        this.description = description;
        this.lista = new ArrayList<Student>();
        this.capacidad = capacidad;
    }


    public String getName () {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public String getDescription () {

        return description;
    }

    public void setDescription (String description) {

        this.description = description;
    }
    
    public void agregarAlumno(Student s) {
    	
    	if(registrados<=capacidad) {
    		lista.add(s);
    		registrados ++;
    	}
    	
    }


	public List<Student> getLista() {
		return lista;
	}


	public void setLista(List<Student> lista) {
		this.lista = lista;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public int getRegistrados() {
		return registrados;
	}


	public void setRegistrados(int registrados) {
		this.registrados = registrados;
	}
    
	public Student buscarPorDni(int dni) {
		
		for(Student e: lista) {
			if(e.getDni()==dni) {
				return e;
			}
		}
		return null;
	}
	
	public List<Student> buscarPorMail(String mail){
		
		List<Student> busqueda = new ArrayList<Student>();
		
		for(Student e: lista) {
			if(e.getEmail().contains(mail)) {
				busqueda.add(e);
			}
		}
		return busqueda;
	}
	
	public void eliminarPorDni(int dni) {
		
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getDni()==dni) {
				lista.remove(i);
				registrados--;
			}
		}
	}
	
	public void eliminarPorMail(String email) {
		for(Student e:lista) {
			if(e.getEmail().equals(email)) {
				lista.remove(e);
				registrados--;
			}
		}
	}
}
package core.com.capgemini.heskuelita.service;

//Interfaz para la fabrica de BBDD
public interface IConectionServer {
	public void Setup () throws Exception;
	public void Destroy () throws Exception;

}

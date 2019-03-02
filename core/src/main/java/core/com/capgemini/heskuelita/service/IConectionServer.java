package core.com.capgemini.heskuelita.service;


//Interfaz para la fabrica de BBDD
public interface IConectionServer {
	public void Setup () throws Exception;
	public void Destroy () throws Exception;
	
	public void Create(
			String name, 
			String last_name, 
			String doc_type, 
			int doc_num, 
			int phone, 
			String sex,
			String screet, 
			int screet_number, 
			int zip_code, 
			String email) throws Exception;
	public void Read () throws Exception;
	public void Update () throws Exception;
	public void Delete () throws Exception;
	

}

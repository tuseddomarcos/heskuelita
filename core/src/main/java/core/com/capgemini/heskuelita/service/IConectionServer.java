package core.com.capgemini.heskuelita.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IConectionServer {
	public void Setup () throws Exception;
	public void Create (
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
	public void Destroy () throws Exception;
	void writeResult (ResultSet rs) throws SQLException;
}

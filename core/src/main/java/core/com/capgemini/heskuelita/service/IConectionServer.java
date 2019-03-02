package core.com.capgemini.heskuelita.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IConectionServer {
	public void Setup () throws Exception;
	public void Destroy () throws Exception;

}

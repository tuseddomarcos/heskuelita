
package com.capgemini.heskuelita.services;

import java.util.*;


public interface IGerenicCrud <T, K> {
	

	//generic crud 
	
	public void Add(T a);
	
	public ArrayList<T> ListAll(); 
	
	public void Edit(T a);
	
	public void DeleteByID(T a);
	
	public T FindByID(K id);
	

}

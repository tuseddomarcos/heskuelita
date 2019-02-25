package com.capgemini.heskuelita.beans;

import java.util.List;

import com.capgemini.heskuelita.beans.User;

public interface IUser {

	//Adds User
	void AddUser (User user);
	
	//Finds one or some User with specific info, 
	User FindbyId (int id);
	List<User> FindbyUser (String user);	

	//Showing all the Users 
	List<User> ShowAll();	
	
	//Modifys User info
	User ChangeId (User user, int id);
	User ChangeUser (String user);	
	User ChangePassword (String password);	

	//Delete a User
	void DeleteUser(User User);
}

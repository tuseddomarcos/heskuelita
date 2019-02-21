package com.capgemini.heskuelita.service;

import com.capgemini.heskuelita.beans.Room;

public interface IRoomService {

	void add(Room room);
	
	void delete(Room room);
	
	void update(Room room);
	
	Room[] findAll();
	
}

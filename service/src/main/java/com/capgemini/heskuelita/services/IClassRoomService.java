
package com.capgemini.heskuelita.services;

import java.util.ArrayList;

import com.capgemini.heskuelita.beans.ClassRoom;

public interface IClassRoomService extends IGerenicCrud<ClassRoom, Long>{
	
	//crud + extra methods 
	
	public ArrayList<ClassRoom> ClassRoomPlace(ClassRoom pClassroom);
	
}
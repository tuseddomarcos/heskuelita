package com.capgemini.heskuelita.beans;

public class Classroom extends Component { 	
		
		private Long number;
		private Long capacity;
		private short floor;



public Classroom ( ) {
	super ();
}

public Classroom(int id, Long number, Long capacity, short floor) {
	
	super (id);
	this.setNumber(number);
	this.setCapacity(capacity);
	this.setFloor(floor);
	
}

public Long getNumber() {
	return number;
}

public void setNumber(Long number) {
	this.number = number;
}

public short getFloor() {
	return floor;
}

public void setFloor(short floor) {
	this.floor = floor;
}

public Long getCapacity() {
	return capacity;
}

public void setCapacity(Long capacity) {
	this.capacity = capacity;
}


}

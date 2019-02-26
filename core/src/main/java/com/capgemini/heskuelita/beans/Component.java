package com.capgemini.heskuelita.beans;

public abstract class Component {
	
	private int id; 
	
	Component (){ 
		
		super ();
	}
	
    public Component (int id) {

        this.id = id;
    }


    public int getId () {

        return id;
    }

    public void setId (int id) {

        this.id = id;
    }

}

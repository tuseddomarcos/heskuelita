package com.capgemini.heskuelita.beans;

public abstract class Component {
	
	protected long id;
	
	public Component() {
		super();
	}
	
	public Component(long id) {
		super();
		this.setId(id);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

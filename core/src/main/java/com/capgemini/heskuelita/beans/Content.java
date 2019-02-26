package com.capgemini.heskuelita.beans;

public class Content extends Component {
	
	private String unit;
	private String description;
	private int idCourse;

	public Content (){
		super();
	}
	
	public Content (int id, String unit, String description, int idCourse) {
		super(id);
		this.setUnit(unit);
		this.setDescription(description);
		this.setIdCourse(idCourse);
		
		
		
}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	
	

}

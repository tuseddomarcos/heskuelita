package beans;

public class Inscription {
	
	private Student student;
	private AcademicOffer academicOffer;
	private int id;

	public Inscription(int id, Student student, AcademicOffer academicOffer) {
		this.id = id ;
		this.student = student ;
		this.academicOffer = academicOffer ;
		
	}

}

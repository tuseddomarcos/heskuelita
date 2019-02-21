package core.com.capgemini.heskuelita.beans;

public interface INservice {
	public void SinInStudent(Student student);
	public Student Read(Student student);
	public void Update(Student student);
	public void Delete(Student student);
	
	public void SinInClassroom(Classroom classroom);
	public Student Read(Classroom classroom);
	public void Update(Classroom classroom);
	public void Delete(Classroom classroom);
	
	
}



public class Course_per_student {
	private int id;
	private Course course;
	private Student student;
	public Course_per_student(int id, Course course, Student student) {
		this.id=id;
		this.course=course;
		this.student=student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}

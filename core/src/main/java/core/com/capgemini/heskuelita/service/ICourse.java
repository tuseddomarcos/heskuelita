package core.com.capgemini.heskuelita.service;

import core.com.capgemini.heskuelita.beans.Course;

public interface ICourse {
	void SinIn(Course course);
	Course Read(int id);
	void Update(Course course);
	void Delete(Course course);
}

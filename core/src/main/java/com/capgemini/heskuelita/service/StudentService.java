package com.capgemini.heskuelita.service;

import com.capgemini.heskuelita.beans.Student;

interface IStudentService {
	
	void add (Student student);
	
	Student findByDNI (int dni);
			}


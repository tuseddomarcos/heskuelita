package com.capgemini.heskuelita.service;

import com.capgemini.heskuelita.data.entity.StudentAnnotation;

public interface IStuentSecurityService {

    void NewStudent(StudentAnnotation user) throws  SecurityException;
}

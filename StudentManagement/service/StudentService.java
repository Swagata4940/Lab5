package com.greatlearning.StudentManagement.service;


import java.util.List;

import com.greatlearning.StudentManagement.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

	public void print(List<Student> student);
}


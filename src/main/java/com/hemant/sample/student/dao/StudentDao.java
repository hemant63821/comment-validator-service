package com.hemant.sample.student.dao;

import java.util.List;

import com.hemant.sample.student.model.Student;

public interface StudentDao {
	
	public void create(Student student);

	public void update(Student student);

	public List<Student> findAll();

	public void getbyId(String Id);
	
	public void removeById(String id);
}

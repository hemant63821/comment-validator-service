package com.hemant.sample.student.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.hemant.sample.student.dao.StudentDao;
import com.hemant.sample.student.model.Student;

@Repository
@Qualifier("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	 MongoTemplate mongoTemplate;
	
	  final String COLLECTION = "sample";

	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getbyId(String Id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeById(String id) {
		// TODO Auto-generated method stub
		
	}

}

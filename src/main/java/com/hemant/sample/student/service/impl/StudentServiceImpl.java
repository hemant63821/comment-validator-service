package com.hemant.sample.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.sample.student.dao.StudentDao;
import com.hemant.sample.student.model.Student;
import com.hemant.sample.student.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDao studentDao;

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getStudentbyId(String studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudentById(String studentid) {
		// TODO Auto-generated method stub
		
	}

}

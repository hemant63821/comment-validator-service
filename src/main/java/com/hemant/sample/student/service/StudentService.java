package com.hemant.sample.student.service;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hemant.sample.student.model.Student;

@Controller
@RequestMapping("student")
public interface StudentService {

	
	public void createStudent(Student student);

	public void updateStudent(Student student);

	public List<Student> findAllStudent();

	public void getStudentbyId(String studentId);
	
	public void removeStudentById(String studentid);
}

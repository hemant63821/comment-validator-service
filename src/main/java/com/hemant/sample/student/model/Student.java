package com.hemant.sample.student.model;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student")
public class Student implements Serializable{
	
	
	private static final long serialVersionUID = 5619746681513249702L;
	
	@Id
	private String studentId;
	private String studentName;
	private String rollNo;
	private String dob;
	private String fatherName;
	private String motherName;
	
	public Student (String studentName, String rollNo, String dob, String fatherName, String motherName) {
		super();
		this.studentId = UUID.randomUUID().toString();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.dob = dob;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
 	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

}

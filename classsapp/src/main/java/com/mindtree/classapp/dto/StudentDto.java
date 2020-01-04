package com.mindtree.classapp.dto;

import java.sql.Date;

public class StudentDto {
	
	private int studentId;
	private String studentName;
	private Date studentDob;
	private int studentAge;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(int studentId, String studentName, Date studentDob, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDob = studentDob;
		this.studentAge = studentAge;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(Date studentDob) {
		this.studentDob = studentDob;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	

}

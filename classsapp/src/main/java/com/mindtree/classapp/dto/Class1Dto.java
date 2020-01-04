package com.mindtree.classapp.dto;

import java.util.List;

public class Class1Dto {
	
	private int classId;
	private String classSection;
	private String classTeacherName;
	private int noOfStudents;
	private List<StudentDto> studentDto;
	public Class1Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class1Dto(int classId, String classSection, String classTeacherName, int noOfStudents,
			List<StudentDto> studentDto) {
		super();
		this.classId = classId;
		this.classSection = classSection;
		this.classTeacherName = classTeacherName;
		this.noOfStudents = noOfStudents;
		this.studentDto = studentDto;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassSection() {
		return classSection;
	}
	public void setClassSection(String classSection) {
		this.classSection = classSection;
	}
	public String getClassTeacherName() {
		return classTeacherName;
	}
	public void setClassTeacherName(String classTeacherName) {
		this.classTeacherName = classTeacherName;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public List<StudentDto> getStudentDto() {
		return studentDto;
	}
	public void setStudentDto(List<StudentDto> studentDto) {
		this.studentDto = studentDto;
	}
	
	
	

}

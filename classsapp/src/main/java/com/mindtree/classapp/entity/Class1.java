package com.mindtree.classapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Class1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	private String classSection;
	private String classTeacherName;
	private int noOfStudents;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "classId")
	private List<Student> student;
	public Class1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class1(int classId, String classSection, String classTeacherName, int noOfStudents, List<Student> student) {
		super();
		this.classId = classId;
		this.classSection = classSection;
		this.classTeacherName = classTeacherName;
		this.noOfStudents = noOfStudents;
		this.student = student;
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
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
	
	
	
	

}

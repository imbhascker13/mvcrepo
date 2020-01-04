package com.mindtree.springbootmvc.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentDepartment;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable(name = "lab_student", joinColumns = @JoinColumn(name = "studentId"), inverseJoinColumns = @JoinColumn(name = "labId"))
	private Set<Lab> lab;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentDepartment, Set<Lab> lab) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.lab = lab;
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

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public Set<Lab> getLab() {
		return lab;
	}

	public void setLab(Set<Lab> lab) {
		this.lab = lab;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", lab=" + lab + "]";
	}

}

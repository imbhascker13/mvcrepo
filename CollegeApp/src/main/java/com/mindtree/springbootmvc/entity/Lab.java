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
import javax.persistence.ManyToOne;

@Entity
public class Lab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int labId;
	private String labName;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
	private College college;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name="lab_student",joinColumns = @JoinColumn(name="labId"),inverseJoinColumns = @JoinColumn(name="studentId"))
	private Set<Student> student;
	public Lab() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lab(int labId, String labName, College college, Set<Student> student) {
		super();
		this.labId = labId;
		this.labName = labName;
		this.college = college;
		this.student = student;
	}
	public int getLabId() {
		return labId;
	}
	public void setLabId(int labId) {
		this.labId = labId;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Lab [labId=" + labId + ", labName=" + labName + ", college=" + college + ", student=" + student + "]";
	}
	
	
	

}

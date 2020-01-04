package com.mindtree.springbootmvc.dto;

import java.util.List;

public class StudentDto {
	
	
	private int studentId;
	private String studentName;
	private String studentDepartment;
	private List<LabDto> labDto;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDto(int studentId, String studentName, String studentDepartment, List<LabDto> labDto) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.labDto = labDto;
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
	
	public List<LabDto> getLabDto() {
		return labDto;
	}
	public void setLabDto(List<LabDto> labDto) {
		this.labDto = labDto;
	}
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", labDto=" + labDto + "]";
	}
	
	


}

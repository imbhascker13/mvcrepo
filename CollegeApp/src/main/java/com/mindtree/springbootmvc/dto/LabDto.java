package com.mindtree.springbootmvc.dto;

import java.util.List;

public class LabDto {
	
	private int labId;
	private String labName;
	private CollegeDto collegeDto;
	private List<StudentDto> studentDto;
	public LabDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabDto(int labId, String labName, CollegeDto collegeDto, List<StudentDto> studentDto) {
		super();
		this.labId = labId;
		this.labName = labName;
		this.collegeDto = collegeDto;
		this.studentDto = studentDto;
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
	
	public CollegeDto getCollegeDto() {
		return collegeDto;
	}
	public void setCollegeDto(CollegeDto collegeDto) {
		this.collegeDto = collegeDto;
	}
	
	public List<StudentDto> getStudentDto() {
		return studentDto;
	}
	public void setStudentDto(List<StudentDto> studentDto) {
		this.studentDto = studentDto;
	}
	@Override
	public String toString() {
		return "LabDto [labId=" + labId + ", labName=" + labName + ", collegeDto=" + collegeDto + ", studentDto="
				+ studentDto + "]";
	}
	
	
	

}

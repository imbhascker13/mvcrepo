package com.mindtree.springbootmvc.dto;

import java.util.List;

public class CollegeDto {
	
	private int collegeId;
	private String collegeName;
	private int collegeCapacity;
	private String collegeLocation;
	private List<LabDto> labDto;
	public CollegeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollegeDto(int collegeId, String collegeName, int collegeCapacity, String collegeLocation,
			List<LabDto> labDto) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeCapacity = collegeCapacity;
		this.collegeLocation = collegeLocation;
		this.labDto = labDto;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getCollegeCapacity() {
		return collegeCapacity;
	}
	public void setCollegeCapacity(int collegeCapacity) {
		this.collegeCapacity = collegeCapacity;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	public List<LabDto> getLabDto() {
		return labDto;
	}
	public void setLabDto(List<LabDto> labDto) {
		this.labDto = labDto;
	}
	@Override
	public String toString() {
		return "CollegeDto [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCapacity="
				+ collegeCapacity + ", collegeLocation=" + collegeLocation + ", labDto=" + labDto + "]";
	}

	

}

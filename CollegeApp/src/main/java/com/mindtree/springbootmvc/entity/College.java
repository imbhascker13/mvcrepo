package com.mindtree.springbootmvc.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collegeId;
	private String collegeName;
	private int collegeCapacity;
	private String collegeLocation;
	
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "college")
	private Set<Lab> lab;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(int collegeId, String collegeName, int collegeCapacity, String collegeLocation, Set<Lab> lab) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeCapacity = collegeCapacity;
		this.collegeLocation = collegeLocation;
		this.lab = lab;
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

	public Set<Lab> getLab() {
		return lab;
	}

	public void setLab(Set<Lab> lab) {
		this.lab = lab;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCapacity="
				+ collegeCapacity + ", collegeLocation=" + collegeLocation + ", lab=" + lab + "]";
	}
	
	
	

}

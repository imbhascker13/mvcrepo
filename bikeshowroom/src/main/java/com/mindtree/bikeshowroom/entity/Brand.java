package com.mindtree.bikeshowroom.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	private String brandName;
	private float investment;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="brandId")
	List<Bike>bikes;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Brand(int brandId, String brandName, float investment, List<Bike> bikes) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.investment = investment;
		this.bikes = bikes;
	}



	public void setInvestment(float investment) {
		this.investment = investment;
	}



	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + ", investment=" + investment + ", bikes="
				+ bikes + "]";
	}

	public double getInvestment() {
		return investment;
	}

	
	
	
}

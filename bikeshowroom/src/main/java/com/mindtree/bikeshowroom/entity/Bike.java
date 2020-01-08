package com.mindtree.bikeshowroom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bikeId;
	private String bikeName;
	private float bikePrice;
	public Bike(int bikeId, String bikeName, float bikePrice) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public float getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(float bikePrice) {
		this.bikePrice = bikePrice;
	}
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikePrice=" + bikePrice + "]";
	}
	
	
	 
}

package com.mindtree.bikeshowroom.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dealer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealerId;
	private String dealerName;
	private String dealerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="dealerId")
	Brand brand;
	
	public Dealer(int dealerId, String dealerName, String dealerAddress, Brand brand) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.brand = brand;
	}
	public Dealer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Dealer [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerAddress=" + dealerAddress
				+ ", brand=" + brand + "]";
	}

	
}

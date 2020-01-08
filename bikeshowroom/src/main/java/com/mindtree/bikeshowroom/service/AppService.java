package com.mindtree.bikeshowroom.service;

import java.util.List;

import com.mindtree.bikeshowroom.entity.Bike;
import com.mindtree.bikeshowroom.entity.Brand;
import com.mindtree.bikeshowroom.entity.Dealer;

public interface AppService {

	public 	String assignBrand(int brandId, int dealerId);

	public String assignBike(Bike bike, int brandId);

	public List<Bike> getAllBikes(int brandId);

	public List<Brand> getInvest();

	public List<Dealer> index1();

	public List<Brand> index2();

	public List<Brand> index3();

	public List<Brand> index4();

	public List<Dealer> index5();

}

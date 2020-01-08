package com.mindtree.bikeshowroom.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bikeshowroom.entity.Bike;
import com.mindtree.bikeshowroom.entity.Brand;
import com.mindtree.bikeshowroom.entity.Dealer;
import com.mindtree.bikeshowroom.repository.BikeRepository;
import com.mindtree.bikeshowroom.repository.BrandRepository;
import com.mindtree.bikeshowroom.repository.DealerRepository;
import com.mindtree.bikeshowroom.service.AppService;

@Service
public class AppServiceImpl implements AppService {
	@Autowired
	BikeRepository bikeRepository;
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	DealerRepository dealerRepository;
	@Override
	public String assignBrand(int brandId, int dealerId) {
		Brand brand=brandRepository.getOne(brandId);
		Dealer dealer=dealerRepository.getOne(dealerId);
		dealer.setBrand(brand);
		
		dealerRepository.save(dealer);
		//brandRepository.save(brand);
		return "assigned successfully" ;
	}
	@Override
	public String assignBike(Bike bike, int brandId) {
		Brand brand=brandRepository.getOne(brandId);
		bikeRepository.save(bike);
		brand.getBikes().add(bike);
		Brand newBrand=brandRepository.save(brand);
		return "assigned successfully";
	}
	@Override
	public List<Bike> getAllBikes(int dealerId) {
		Dealer dealer=dealerRepository.getOne(dealerId);
		//Brand brand=brandRepository.findById(dealerId).get();
		List<Bike> bikes=dealer.getBrand().getBikes();
		return bikes;
	}
	@Override
	public List<Brand> getInvest() {
		List<Brand>brands=brandRepository.findAll();
		List<Brand>newBrands=new ArrayList<Brand>();
		for(Brand brand:brands) {
			float price=0;
			//Bike bike1=new Bike();
			//List<Bike>bikes=new ArrayList<Bike>();
			for(Bike bike:brand.getBikes())
			{
				price=price+bike.getBikePrice();
				
			}
			brand.setInvestment(price);
			newBrands.add(brand);
			}
		return newBrands;
		
	}
	@Override
	public List<Dealer> index1() {
		List<Dealer>dealers=dealerRepository.findAll();
		return dealers;
	}
	public List<Brand> index2() {
		List<Brand>brands=brandRepository.findAll();
		return brands;
	}
	@Override
	public List<Brand> index3() {
		List<Brand>newBrands=brandRepository.findAll();
		return newBrands;
	}
	@Override
	public List<Brand> index4() {
		List<Brand>brands=brandRepository.findAll();
		return brands;
	}
	@Override
	public List<Dealer> index5() {
		List<Dealer>dealers=dealerRepository.findAll();
		return dealers;
	}
	
}

package com.mindtree.bikeshowroom.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.bikeshowroom.entity.Bike;
import com.mindtree.bikeshowroom.entity.Brand;
import com.mindtree.bikeshowroom.entity.Dealer;
import com.mindtree.bikeshowroom.service.AppService;

@Controller
public class AppRunner {
	@Autowired
	AppService appService;
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	@RequestMapping("/assignbrand")
	public String index1(Model model) {
		List<Brand> brands=appService.index2();
		model.addAttribute("brands", brands);
		List<Dealer> dealers=appService.index1();
		model.addAttribute("dealers", dealers);
		return "newbrand";
	}
	@RequestMapping("/assignbikes")
	public String index2(Model model) {
		List<Brand>brands=appService.index3();
		model.addAttribute("brands", brands);
		return "bikes";
	}
//	@RequestMapping("/getbikes")
//	public String index4(Model model) {
//		List<Brand>brands=appService.index4();
//		model.addAttribute("brands", brands);
//		return "viewbikes";
//	}
	@RequestMapping("/getbikes")
	public String index5(Model model) {
		List<Dealer>dealers=appService.index5();
		model.addAttribute("dealers", dealers);
		return "viewbikes";
	}
	@RequestMapping(path="/assignBrand")
	public String assignBrand(@RequestParam int brandId,@RequestParam int dealerId,Model model) {
		String message=appService.assignBrand(brandId,dealerId);
		model.addAttribute("message",message);
		return "message";
	}
	@RequestMapping("/assignBikes")
	public String assignBike(Bike bike,@RequestParam int brandId,Model model) {
		String message=appService.assignBike(bike,brandId);
		model.addAttribute("message", message);
		return "message";
	}
	@RequestMapping("/getBikes")
	public String getAllBikes(@RequestParam int dealerId,Model model) {
		List<Brand>brands=appService.index4();
		model.addAttribute("brands", brands);
		List<Bike>bikes=appService.getAllBikes(dealerId);
		model.addAttribute("bikes",bikes);
		return "getbikes";
	}
	@RequestMapping("/getinvest")
	public String getInvest(Model model) {
		List<Brand>brands=appService.getInvest();
		model.addAttribute("brands", brands);
	//	model.addAttribute("prices", prices);
		return "view";
	}
}

package com.mindtree.classapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.classapp.dto.Class1Dto;
import com.mindtree.classapp.dto.StudentDto;
import com.mindtree.classapp.service.Class1Service;
import com.mindtree.classapp.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private Class1Service class1Service;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String index(){
	
		return "menu";
	
	}
	
	@RequestMapping("/classinsert")
	public String classInsert() {
		return "insertclass";
	}
	
	@RequestMapping("/addclass")
	public String addClass(Class1Dto class1Dto) {
		
		class1Service.addClass(class1Dto);
		return "message";
		
	}
	
	
	@RequestMapping("/getclasssection")
	public String getClassSection() {
		return "getsection";
	}
	
	@PostMapping("/addstudent")
	public String addStudent(StudentDto studentDto,@RequestParam String classSection) {
		
		studentService.addStudent(studentDto,classSection);
		return "message";
		
	}
	
	@RequestMapping("/getsections")
	public String getSections() {
		return "getsections";
	}
	
	@GetMapping("/getstudentdetails")
	public String getStudentDetails(@RequestParam String classSection,Model model) {
		Class1Dto class1Dto=studentService.getStudentDetails(classSection);
		model.addAttribute("class1Dto", class1Dto);
		return "getsections";
	}
	

}

package com.mindtree.springbootmvc.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.springbootmvc.Exception.ServiceException;
import com.mindtree.springbootmvc.dto.CollegeDto;
import com.mindtree.springbootmvc.dto.StudentDto;
import com.mindtree.springbootmvc.entity.Student;
import com.mindtree.springbootmvc.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@PostMapping("/insert")
	public ResponseEntity<Map<String, Object>> addAllDetails(@RequestBody CollegeDto collegeDto) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "inserting details");
		response.put("ERROR", false);
		response.put("Body", collegeService.addAllDetails(collegeDto));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	@PutMapping("/update/{collegeId}/{labId}/{studentName}")
	public ResponseEntity<Map<String, Object>> updateDetails(@PathVariable int collegeId, @PathVariable int labId,
			@PathVariable String studentName) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "inserting details");
		response.put("ERROR", false);
		response.put("Body", collegeService.updateDetails(collegeId, labId, studentName));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	@PostMapping("/insertdetails")
	public ResponseEntity<Map<String, Object>> addDetails(@RequestBody StudentDto studentDto) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "inserting details");
		response.put("ERROR", false);
		response.put("Body", collegeService.addDetails(studentDto));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	@GetMapping("/getdetails/{studentId}")
	public ResponseEntity<Map<String, Object>> getLabDetails(@PathVariable int studentId) throws ServiceException {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "getting labs");
		response.put("ERROR", false);
		response.put("Body", collegeService.getLabDetails(studentId));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

	@GetMapping("/getStudentdetails/{labName}")
	public ResponseEntity<Map<String, Object>> getStudentDetails(@PathVariable String labName) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		response.put("Header", "getting labs");
		response.put("ERROR", false);
		response.put("Body", collegeService.getStudentDetails(labName));
		response.put("HTTP STATUS", HttpStatus.OK);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);

	}

}

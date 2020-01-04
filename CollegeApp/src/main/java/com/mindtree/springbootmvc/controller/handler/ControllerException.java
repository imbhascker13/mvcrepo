package com.mindtree.springbootmvc.controller.handler;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.springbootmvc.Exception.ServiceException;
import com.mindtree.springbootmvc.controller.CollegeController;

@RestControllerAdvice(assignableTypes=CollegeController.class)
public class ControllerException {
	
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<Map<String,Object>> serviceExceptionHandler(Exception e,Throwable cause){
		Map<String,Object> response=new LinkedHashMap<String, Object>();
		response.put("Header", "ErrorMessage");
		response.put("Error", true);
		response.put("Body", e.getMessage());
		response.put("Header", HttpStatus.BAD_REQUEST);
		return new ResponseEntity<Map<String,Object>> (response,HttpStatus.BAD_REQUEST);
		
	}
	

}

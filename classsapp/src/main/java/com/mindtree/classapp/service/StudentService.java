package com.mindtree.classapp.service;

import java.util.List;

import com.mindtree.classapp.dto.Class1Dto;
import com.mindtree.classapp.dto.StudentDto;

public interface StudentService {

	/**
	 * @param classSection
	 * @return insertion status for student details
	 */
	public String addStudent(StudentDto studentDto,String classSection);

	/**
	 * @param classSection
	 * @return students details
	 */
	public Class1Dto getStudentDetails(String classSection);

}

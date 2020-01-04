package com.mindtree.springbootmvc.service;

import java.util.List;
import java.util.Set;

import com.mindtree.springbootmvc.Exception.ServiceException;
import com.mindtree.springbootmvc.dto.CollegeDto;
import com.mindtree.springbootmvc.dto.LabDto;
import com.mindtree.springbootmvc.dto.StudentDto;

public interface CollegeService {

	/**
	 * @param collegeDto
	 * @return inserted all details message
	 */
	public String addAllDetails(CollegeDto collegeDto);

	/**
	 * @param studentDto
	 * @return insert details of student with labs
	 */
	public String addDetails(StudentDto studentDto);

	/**
	 * @param studentId
	 * @return lab details
	 * @throws ServiceException
	 */
	public Set<LabDto> getLabDetails(int studentId) throws ServiceException;

	/**
	 * @param collegeId
	 * @param labId
	 * @return updated details
	 */
	public String updateDetails(int collegeId, int labId, String studentName);

	/**
	 * @param labId
	 * @return student details
	 */
	public Set<StudentDto> getStudentDetails(String labName);

}

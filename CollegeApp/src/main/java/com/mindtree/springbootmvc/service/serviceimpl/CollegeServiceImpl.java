package com.mindtree.springbootmvc.service.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.springbootmvc.Exception.ServiceException;
import com.mindtree.springbootmvc.Exception.util.ErrorConstants;
import com.mindtree.springbootmvc.dto.CollegeDto;
import com.mindtree.springbootmvc.dto.LabDto;
import com.mindtree.springbootmvc.dto.StudentDto;
import com.mindtree.springbootmvc.entity.College;
import com.mindtree.springbootmvc.entity.Lab;
import com.mindtree.springbootmvc.entity.Student;
import com.mindtree.springbootmvc.repository.CollegeRepository;
import com.mindtree.springbootmvc.repository.LabRepository;
import com.mindtree.springbootmvc.repository.StudentRepository;
import com.mindtree.springbootmvc.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {

	@Autowired
	CollegeRepository collegeRepository;
	@Autowired
	LabRepository labRepository;
	@Autowired
	StudentRepository studentRepository;

	ModelMapper m = new ModelMapper();

	@Override
	public String addAllDetails(CollegeDto collegeDto) {

		College college = m.map(collegeDto, College.class);

		for (Lab l : college.getLab()) {

			l.setCollege(college);
			
			for(Student s:l.getStudent()) {
				
			}
			

		}
		collegeRepository.save(college);

		return "inserted";

	}

//		List<Student> stud=studentRepository.findAll();

//		for(Lab lab:college.getLab()) {	
//			
//			Set<Lab> l=new HashSet<Lab>();
//			college.setLab(college.getLab());
//			
//			for(Student student:lab.getStudent()) {
//				
//				for(Student st:stud) {
//					
//					if(st.getStudentName().equalsIgnoreCase(student.getStudentName())) {
//						
//						st.setLab(l);
//					}
//					
//					else {
//						student.setLab(l);
//					}	
//				}
//				
//			}
//			
//		}
//		collegeRepository.save(college);
//		
//	
//		
//		List<Student> student = new ArrayList<Student>();
//
//		List<Student> stud = studentRepository.findAll();
//		
//        List<Lab> labs1=new ArrayList<Lab>();
//        
//		for (Lab l : college.getLab()) {
//			
//			
//			
//			List<Student> students = l.getStudent();
//			for (Student s : students) {
//				List<Lab> labs = s.getLab();
//
//				for (Student st : stud) {
//
//					if (s.getStudentName().equalsIgnoreCase(st.getStudentName())) {
//						st.setLab(labs);
//						
//					} else {
//						s.setLab(labs);
//						
//					}
//				}
//
//			}
//			
////			l.setCollege(college);
//			labs1.add(l);
//		}
//		college.setLab(labs1);
//		collegeRepository.save(college);
//  
//		return "inserted";
//	}

	@Override
	public String updateDetails(int collegeId, int labId, String studentName) {

		College college = collegeRepository.findById(collegeId).get();
		Student student1 = studentRepository.findBystudentName(studentName).get();

		Set<Student> student2 = new HashSet<Student>();

		student2.add(student1);

		Set<Lab> lab = college.getLab();

		for (Lab l : lab) {

			if (l.getLabId() == labId)
				l.setStudent(student2);

		}

		collegeRepository.saveAndFlush(college);

		return "updated";
	}

	@Override
	public Set<LabDto> getLabDetails(int studentId) throws ServiceException {

		Student student = studentRepository.findById(studentId)
				.orElseThrow(() -> new ServiceException(ErrorConstants.NOSTUDENTIDFOUND));
		Set<LabDto> l = new HashSet<LabDto>();
		student.getLab().forEach(i -> {

			LabDto labDto = m.map(i, LabDto.class);

			l.add(labDto);

		});

		return l;
	}

	@Override
	public Set<StudentDto> getStudentDetails(String labName) {

		Lab lab = labRepository.findBylabName(labName);

		Set<StudentDto> student = new HashSet<StudentDto>();

		lab.getStudent().forEach(i -> {

			StudentDto studentDto = m.map(i, StudentDto.class);

			student.add(studentDto);

		});

		return student;
	}

	@Override
	public String addDetails(StudentDto studentDto) {

		Student student = m.map(studentDto, Student.class);

		Set<Lab> lab = new HashSet<Lab>();

		for (Lab l : student.getLab()) {

			lab.add(l);
			student.setLab(lab);

		}

		studentRepository.save(student);

		return "inserted";
	}

}

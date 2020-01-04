package com.mindtree.classapp.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classapp.dto.Class1Dto;
import com.mindtree.classapp.dto.StudentDto;
import com.mindtree.classapp.entity.Class1;
import com.mindtree.classapp.entity.Student;
import com.mindtree.classapp.repository.Class1Reposistory;
import com.mindtree.classapp.repository.StudentRepository;
import com.mindtree.classapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	@Autowired
	private Class1Reposistory class1Repository;
	@Autowired
	private StudentRepository studentRepository;
	private ModelMapper mapper=new ModelMapper();

	@Override
	public String addStudent(StudentDto studentDto,String classSection) {
		
		
		List<Class1> c=class1Repository.findAll();
		Student student=mapper.map(studentDto, Student.class);
		
		Class1 c1=c.stream().filter(i->i.getClassSection().equals(classSection)).findAny().get();
		List<Student> student1=c1.getStudent();
		
        if(student1.size() <c1.getNoOfStudents())

        {
			
			c1.getStudent().add(student);
			class1Repository.save(c1);
				
		}
		return "inserted";
	}

	@Override
	public Class1Dto getStudentDetails(String classSection) {
		
		
		List<StudentDto> studentDto=new ArrayList<>();
		 List<Class1> c=class1Repository.findAll();
		 
		 Class1 c1=c.stream().filter(i->i.getClassSection().equals(classSection)).findAny().get();
		 
		 for(Student s:c1.getStudent()) {
			
				StudentDto student=new StudentDto();
					student.setStudentName(s.getStudentName());
					student.setStudentDob(s.getStudentDob());
					student.setStudentAge(s.getStudentAge());
					studentDto.add(student);
					}
		 

               Class1Dto c2=new Class1Dto();
               c2.setClassSection(c1.getClassSection());
               c2.setClassTeacherName(c1.getClassTeacherName());
               c2.setNoOfStudents(c1.getNoOfStudents());
               c2.setStudentDto(studentDto);
               
		 

		return c2;
	}

}

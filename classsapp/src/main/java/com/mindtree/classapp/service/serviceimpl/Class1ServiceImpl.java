package com.mindtree.classapp.service.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.classapp.dto.Class1Dto;
import com.mindtree.classapp.entity.Class1;
import com.mindtree.classapp.repository.Class1Reposistory;
import com.mindtree.classapp.service.Class1Service;

@Service
public class Class1ServiceImpl implements Class1Service{
	
	
	@Autowired
	private Class1Reposistory class1Repository;
	private ModelMapper mapper=new ModelMapper();

	@Override
	public String addClass(Class1Dto class1Dto) {
		
		Class1 c=mapper.map(class1Dto, Class1.class);
		
		class1Repository.save(c);
		
		
		return "inserted";
	}
	
	
	

}

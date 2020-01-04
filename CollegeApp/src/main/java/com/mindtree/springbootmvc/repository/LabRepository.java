package com.mindtree.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.Lab;
@Repository
public interface LabRepository extends JpaRepository<Lab, Integer>{

	Lab findBylabName(String labName);

}

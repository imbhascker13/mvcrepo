package com.mindtree.springbootmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer>{

}

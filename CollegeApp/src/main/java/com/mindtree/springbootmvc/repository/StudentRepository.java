package com.mindtree.springbootmvc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.springbootmvc.entity.College;
import com.mindtree.springbootmvc.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//	Optional<College> findByName(String studentName);

	Optional<Student> findBystudentName(String studentName);

}

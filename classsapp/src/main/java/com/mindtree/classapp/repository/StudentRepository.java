package com.mindtree.classapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.classapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

package com.mindtree.classapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.classapp.entity.Class1;
@Repository
public interface Class1Reposistory extends JpaRepository<Class1, Integer>{

}

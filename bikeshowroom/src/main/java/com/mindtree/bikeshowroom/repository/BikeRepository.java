package com.mindtree.bikeshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikeshowroom.entity.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

}

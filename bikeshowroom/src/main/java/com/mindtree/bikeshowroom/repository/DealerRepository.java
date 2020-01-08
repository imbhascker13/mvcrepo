package com.mindtree.bikeshowroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.bikeshowroom.entity.Dealer;
@Repository
public interface DealerRepository extends JpaRepository<Dealer, Integer> {

}

package com.example.nemanja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.nemanja.domain.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe,Integer>{

	Shoe findOneById(Long Id);
	List<Shoe>findAll();
}

package com.example.nemanja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nemanja.domain.Bag;

@Repository
	public interface BagRepository extends JpaRepository<Bag,Integer>{
		
		Bag findOneById(Long id);
		List<Bag>findAll();
}


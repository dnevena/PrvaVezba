package com.example.nemanja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nemanja.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	Car findOneById(Long id);
	List<Car>findAll();
}

package com.example.nemanja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nemanja.domain.Car;
import com.example.nemanja.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	public Car createCar(String ime, int year) {
		Car car = new Car();
		car.setIme(ime);
		car.setYear(year);
		//ako cuvanje bude uspesno vratice objekat car ako ne sacuva vratice null
		/*
		 *carRepository.save(car);
		 *return car; 
		 */
		return carRepository.save(car);
	}
	
	public void delete(Long id) {
		Car car = carRepository.findOneById(id);
		carRepository.delete(car);
	}
	
	public List<Car> findAll() {
		return carRepository.findAll();	
	}
	
	public Car findOne(Long id) {
		return carRepository.findOneById(id);
	}
	
	public Car edit(Long id, String name, int year) {
		Car car = carRepository.findOneById(id);
		car.setIme(name);
		car.setYear(year);
		return carRepository.save(car);
	}

}

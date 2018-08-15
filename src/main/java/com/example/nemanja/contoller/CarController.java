package com.example.nemanja.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nemanja.contoller.dto.CarDTO;
import com.example.nemanja.domain.Car;
import com.example.nemanja.service.CarService;

@RestController
@RequestMapping("/cars")

public class CarController {
	
	@Autowired
	private CarService carService;

	@PostMapping("")
	public Car create(@RequestBody CarDTO carDto) {
		String name = carDto.getName();
		int year= carDto.getYear();
		
		return carService.createCar(name, year);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCar(@PathVariable("id") Long id) {
		carService.delete(id);
	}
	
	@GetMapping("")
	public List<Car> getAllCars() {
		return carService.findAll();
	}
	
	@GetMapping("/{id}")
	public Car getCar(@PathVariable("id") Long id) {
		return carService.findOne(id);
	}
	
	@PutMapping("/{id}")
	public Car editCar(@PathVariable("id") Long id, @RequestBody CarDTO carDto) {
		String name = carDto.getName();
		int year = carDto.getYear();
		return carService.edit(id, name, year);
	}
	
}

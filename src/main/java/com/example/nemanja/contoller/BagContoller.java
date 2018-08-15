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

import com.example.nemanja.contoller.dto.BagDTO;
import com.example.nemanja.contoller.dto.CarDTO;
import com.example.nemanja.domain.Bag;
import com.example.nemanja.domain.Car;
import com.example.nemanja.service.BagService;

@RestController
@RequestMapping("/bags")

public class BagContoller {
	
	@Autowired
	private BagService bagService;

	@PostMapping("")
	public Bag create(@RequestBody BagDTO bagDto) {
		String ime = bagDto.getName();
		int tip= bagDto.getTip();
		
		return bagService.createBag(ime, tip);
	
	}
	
	@DeleteMapping("/{id}") 
	public void deleteBag(@PathVariable("id") Long id) {
		bagService.delete(id);
		
	}
	
	@GetMapping("") 
	public List<Bag> getAllBags() {
		return bagService.findAll();
	}

	@GetMapping("/{id}") 
	public Bag getBag(@PathVariable("id") Long id) {
		return bagService.findOne(id);
	}
	
	
	@PutMapping("/{id}")
	public Bag editBag(@PathVariable("id") Long id, @RequestBody BagDTO bagDto ){
		String name = bagDto.getName();
		int tip = bagDto.getTip();
		return bagService.edit(id, name, tip);
	}
	
}


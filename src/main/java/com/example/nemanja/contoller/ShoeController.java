package com.example.nemanja.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nemanja.contoller.dto.ShoeDTO;
import com.example.nemanja.domain.Shoe;
import com.example.nemanja.service.ShoeService;

@RestController
@RequestMapping("/shoes")
public class ShoeController {
	
	@Autowired
	private ShoeService shoeService;

	@PostMapping("")
	public Shoe create(@RequestBody ShoeDTO shoeDto) {
		String ime = shoeDto.getName();
		int tip= shoeDto.getTip();
		
		return shoeService.createShoe(ime, tip);
	}
	
	@DeleteMapping("/{id}")
	public void deleteShoe(@PathVariable("id") Long id) {
		shoeService.delete(id);
	}
	
	@GetMapping("")
	public List<Shoe> getAll () {
		return shoeService.findAll();
	} 
	
	@GetMapping("/{id}") 
	public Shoe getOne (@PathVariable("id") Long id) {
		return shoeService.findOne(id);
	}

}

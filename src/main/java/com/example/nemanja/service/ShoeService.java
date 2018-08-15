package com.example.nemanja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.nemanja.domain.Shoe;

import com.example.nemanja.repository.ShoeRepository;

@Service
public class ShoeService {

	
	@Autowired
	private ShoeRepository shoeRepository;
	
	public Shoe createShoe (String ime, int type) {
		
		Shoe shoe = new Shoe();
		shoe.setIme(ime);
		shoe.setType(type);
		
		return shoeRepository.save(shoe);
	}
	
	
	public void delete(Long id) {
		Shoe shoe=shoeRepository.findOneById(id);
		shoeRepository.delete(shoe);
		
	}
	
	public List<Shoe> findAll () {
		return shoeRepository.findAll();
	}
	
	public Shoe findOne(Long id) {
		return shoeRepository.findOneById(id);
	}
	
}



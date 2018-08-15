package com.example.nemanja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nemanja.domain.Bag;
import com.example.nemanja.domain.Car;
import com.example.nemanja.repository.BagRepository;

@Service
public class BagService {

	@Autowired
	private BagRepository bagRepository;
	
	public Bag createBag (String ime, int type) {
		
		Bag bag = new Bag();
		bag.setIme(ime);
		bag.setType(type);
		
		return bagRepository.save(bag);
	}
	
	public void delete(Long id) {
		Bag bag= bagRepository.findOneById(id) ;
		bagRepository.delete(bag);
	}
	
	public List<Bag> findAll() {
		return bagRepository.findAll();
		
	}
	
	public Bag findOne(Long id) {
		return bagRepository.findOneById(id);
	}
	
	public Bag edit(Long id, String name, int type) {
		Bag bag =bagRepository.findOneById(id);
		bag.setIme(name);
		bag.setType(type);
		return bagRepository.save(bag);
	}

	
}

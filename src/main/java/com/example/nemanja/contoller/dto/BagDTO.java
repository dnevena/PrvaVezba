package com.example.nemanja.contoller.dto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nemanja.domain.Bag;


public class BagDTO {


	private String name;
	private int tip;
	
	public BagDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTip() {
		return tip;
	}
	public void setTip(int tip) {
		this.tip = tip;
	}
	
	
		
	
	
}

package com.example.nemanja.contoller.dto;

import java.util.ArrayList;

public class ResponceDrugiDTO {

	private String name;
	private Integer number;
	private ArrayList<Integer> listOfNum = new ArrayList <>();
	public ResponceDrugiDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public ArrayList<Integer> getListOfNum() {
		return listOfNum;
	}
	public void setListOfNum(ArrayList<Integer> listOfNum) {
		this.listOfNum = listOfNum;
	}
	
	
	
}

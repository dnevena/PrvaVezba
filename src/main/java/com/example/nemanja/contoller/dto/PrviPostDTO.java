package com.example.nemanja.contoller.dto;

import java.util.ArrayList;

public class PrviPostDTO {
	
	private String username;
	private String jmbg;
	private String sender;
	private ArrayList<String> arrayFromFrontend = new ArrayList<>();
	
	public PrviPostDTO() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public ArrayList<String> getArrayFromFrontend() {
		return arrayFromFrontend;
	}

	public void setArrayFromFrontend(ArrayList<String> arrayFromFrontend) {
		this.arrayFromFrontend = arrayFromFrontend;
	}

	
	
}

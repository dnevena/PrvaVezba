package com.example.nemanja.domain;

public class ToDo {

	String ime;
	int broj;
	boolean prioritet;
	

	
	public ToDo(String ime, int broj, boolean prioritet) {
		super();
		this.ime = ime;
		this.broj = broj;
		this.prioritet = prioritet;
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public boolean isPrioritet() {
		return prioritet;
	}
	public void setPrioritet(boolean prioritet) {
		this.prioritet = prioritet;
	}
	
	
	
}

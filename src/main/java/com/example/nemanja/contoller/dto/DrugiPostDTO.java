package com.example.nemanja.contoller.dto;

import java.util.ArrayList;

public class DrugiPostDTO {

		private String ime;
		private String broj;
		private ArrayList<Integer> arrayOfNumbers = new ArrayList<>();
	
		public DrugiPostDTO() {
			super();
		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public String getBroj() {
			return broj;
		}

		public void setBroj(String broj) {
			this.broj = broj;
		}

		public ArrayList<Integer> getArrayOfNumbers() {
			return arrayOfNumbers;
		}

		public void setArrayOfNumbers(ArrayList<Integer> arrayOfNumbers) {
			this.arrayOfNumbers = arrayOfNumbers;
		}

	
		
		
}

package com.example.nemanja.contoller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.nemanja.contoller.dto.DrugiPostDTO;
import com.example.nemanja.contoller.dto.PrviPostDTO;
import com.example.nemanja.contoller.dto.ResponceDrugiDTO;
import com.example.nemanja.contoller.dto.ResponseDTO;

@RestController
@RequestMapping("/nemanja")
public class NemanjaController {
	
	private List<Integer> listOfNumbers = new ArrayList<>();
	private List<String> listOfNames = new ArrayList<>();
	
	@GetMapping("")
	public String setList() {
		this.listOfNames.add("Nemanja");
		this.listOfNames.add("Nevena");
		this.listOfNames.add("Olja");
		this.listOfNames.add("Neko treci");
		this.listOfNames.add("Igor");
		
		this.listOfNumbers.add(2);
		this.listOfNumbers.add(5);
		this.listOfNumbers.add(9);
		this.listOfNumbers.add(7);
		this.listOfNumbers.add(31);
		return "radi";
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/hello/{nekoIme}")
	public String helloSomeone(@PathVariable("nekoIme") String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/hello2")
	public String helloQuery(@RequestParam("key") String nestoIzKeya) {
		return nestoIzKeya;
	}

	
	@GetMapping ("/brojevi")
	public String listOfNumbers() {
		return listOfNumbers.toString();
		
	}
	
	@GetMapping ("/names")
	public String listOfNames() {
		return listOfNames.toString();
		
	}
	
	@GetMapping ("/parni")
	public String listOfNumbers1() {
		List<Integer> tempList = new ArrayList<>();
		for(Integer objekat : listOfNumbers) {		
			if(objekat % 2 == 0) {
				tempList.add(objekat);
			}
		}
		return tempList.toString();
	
	}
	
	@GetMapping ("/neparni")
	public String listOfNumbers2() {
		List <Integer> tempList = new ArrayList<> ();
		for (Integer objekat : listOfNumbers) {
			if (objekat % 2 !=0) {
				tempList.add(objekat);
			}
		}
		return tempList.toString();
	}
	
	
	@GetMapping ("/brojevi/{nekiBroj}") 
	public String listOfNumbers3 (@PathVariable ("nekiBroj") String number )  {
		int broj = -1;
		for (Integer objekat : listOfNumbers) {
			if (objekat == Integer.valueOf(number))
				broj = objekat;
		}
			if (broj == -1) {
				
				return "Greska";
			} else {
			 
			 
		return " broj "  + broj;
		
			}
	
	}
	
	@GetMapping ("/names/{nekiBR}") 
	public String listOfNames7 (@PathVariable ("nekiBR") String name) {
		String firstLetter = "";
		List<String> tempList = new ArrayList<>();
		if (name.equals("1")) {
			for (String objekat : listOfNames) {
					if (String.valueOf(objekat.charAt(0)).toLowerCase().equals("n")){
						tempList.add(objekat);
					}
			}
			return tempList.toString();
		}else if (name.equals("2")) {
			for (String objekat : listOfNames ) {
				if (!(String.valueOf(objekat.charAt(0)).toLowerCase().equals("n"))){
					tempList.add(objekat);
				}
			}
			return tempList.toString();
			
		}
		else if (name.equals("3")) {
			for (String objekat : listOfNames) {
				if (objekat.contains(" ")) {
					tempList.add(objekat);
				}
			}
			 return tempList.toString();
		}
		
		else 
			return "Greska" ;
				
			
		

	}
	
	@GetMapping("/kombinovani")
	public String kombinovani (@RequestParam("key1") String key1, @RequestParam("key2")String nestoIzKeya) {
		return key1 + nestoIzKeya;
	}
	
	
	/////// POST REQUEST
	
	@PostMapping("/hello")
	public ResponseDTO prviPostRequest(@RequestBody PrviPostDTO imePrviPostDTO) {
		String nesto = imePrviPostDTO.getUsername();
		String nesto2 = imePrviPostDTO.getJmbg();
		ResponseDTO response = new ResponseDTO();
		response.setFristString(nesto + " " + nesto2);
		response.setSecond(imePrviPostDTO.getArrayFromFrontend().toString());
		return response;
	}
	
	
	@PostMapping("/hi")
	public ResponceDrugiDTO drugiPostRequest(@RequestBody DrugiPostDTO imeDrugiPostDTO) {
		String brojIzDTO = imeDrugiPostDTO.getIme();
		String imeZaResponse = listOfNames.get(Integer.valueOf(brojIzDTO)-1);
		String broj = imeDrugiPostDTO.getBroj();
		Integer brojZaResponse = listOfNumbers.get(Integer.valueOf(broj)-1);
		
		ArrayList<Integer>  temp = new ArrayList<> ();
		System.out.println(imeDrugiPostDTO.getArrayOfNumbers());
		for (Integer br : imeDrugiPostDTO.getArrayOfNumbers()) {
			System.out.println(br);
			System.out.println(listOfNumbers());
			
			Integer izListe = listOfNumbers.get(br-1);
			temp.add(izListe);
		} 
		
		ResponceDrugiDTO response = new ResponceDrugiDTO();
		response.setName(imeZaResponse);
		response.setNumber(brojZaResponse);
		response.setListOfNum(temp);
		
		
		return response;
	}
	
}

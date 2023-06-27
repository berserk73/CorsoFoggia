package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Persona;
import com.example.demo.repositories.DemoRepository;

@Service
public class DemoService {
	
	@Autowired
	private DemoRepository demoRepository;

	public String getHello(
			 String nome, 
			 String cognome) {
		return "Test2222, nome=" + nome + ", cognome = "+ cognome;
	}
	
	public String getHello2(
			 String nome, 
			 String cognome) {
		return "Test2333, nome=" + nome + ", cognome = "+ cognome;
	}
	
	public String postPersona(
			 Persona persona) {
		System.out.println(persona.toString());
		demoRepository.save(persona);
		return persona.toString();
	}

	public List<Persona> getAllPersone() {
		 List<Persona> persone = new ArrayList<Persona>();
		 demoRepository.findAll().forEach(persone::add);
		 return persone;
	}

}

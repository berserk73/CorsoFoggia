package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Persona;

@Service
public class DemoService {

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
	
	public String postHello(
			 Persona persona) {
		System.out.println(persona.toString());
		return persona.toString();
	}
}

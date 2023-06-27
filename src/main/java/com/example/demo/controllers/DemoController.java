package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Persona;
import com.example.demo.services.DemoService;

@RestController
@RequestMapping("api")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@GetMapping("/hello/{nome}/{cognome}")
	public @ResponseBody String  hello(
			@PathVariable String nome, 
			@PathVariable String cognome) {
		return demoService.getHello(nome, cognome);
	}

	@GetMapping("/hello2")
	public @ResponseBody String  hello2(
			@RequestParam String nome, 
			@RequestParam String cognome) {
		return demoService.getHello2(nome, cognome);
	}

	@GetMapping("/persone")
	public ResponseEntity<List<Persona>> getAllPersone() {
		List<Persona> personeList = demoService.getAllPersone();
		if (personeList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(personeList, HttpStatus.OK);
	}

	@PostMapping("/persona")
	public @ResponseBody String  postPersona(
			@RequestBody Persona persona) {
		return demoService.postPersona(persona);
	}

}

package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/hello")
	public @ResponseBody String  helloPost(
			@RequestBody Persona persona) {
		return demoService.postHello(persona);
	}

}

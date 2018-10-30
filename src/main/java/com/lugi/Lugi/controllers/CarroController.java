package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.CarroRepository;

@RestController
public class CarroController {
	
	@Autowired
	CarroRepository carroRepository; 
	
	
	
	@GetMapping("/carro")
	
	@PostMapping("/carro")
	
	@PutMapping("/carro")
	
	
	@DeleteMapping("/carro")
}

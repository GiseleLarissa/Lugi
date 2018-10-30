package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.LocadoraRepository;

@RestController
public class LocadoraController {
	
	@Autowired
	LocadoraRepository locadoraRepository; 
	
	
    @GetMapping("/carro")
	
	@PostMapping("/carro")
	
	@PutMapping("/carro")
	
	
	@DeleteMapping("/carro")

}

package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.ClienteRepository;

@RestController
public class ClienteController {
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
	
	
    @GetMapping("/carro")
	
	@PostMapping("/carro")
	
	@PutMapping("/carro")
	
	
	@DeleteMapping("/carro")

}

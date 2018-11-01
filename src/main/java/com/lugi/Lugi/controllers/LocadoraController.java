package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.model.Locadora;
import com.lugi.Lugi.repositories.LocadoraRepository;

@RestController
public class LocadoraController {
	
	@Autowired
	LocadoraRepository locadoraRepository; 
	
	
    @GetMapping("/carro")
    public Page<Locadora> getLocadora(Pageable pageable){
    	return locadoraRepository.findAll(pageable);
    }
    
    
    
	
	@PostMapping("/carro")
	
	@PutMapping("/carro")
	
	
	@DeleteMapping("/carro")

}

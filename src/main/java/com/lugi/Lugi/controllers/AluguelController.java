package com.lugi.Lugi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.model.Aluguel;
import com.lugi.Lugi.repositories.AluguelRepository;

@RestController
public class AluguelController {
	
	@Autowired
	private AluguelRepository aluguelRepository;
	
	
	@GetMapping("/aluguel")
	public Page<Aluguel> getAluguel(Pageable pageable){
		return aluguelRepository.findAll(pageable);
	}
	
	@PostMapping("/aluguel")
	public Aluguel createAluguel(@Valid @RequestBody Aluguel aluguel) {
		return aluguelRepository.save(aluguel);
	}	
}
package com.lugi.Lugi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.exception.ResourceNotFoundException;
import com.lugi.Lugi.model.Aluguel;
import com.lugi.Lugi.model.Carro;
import com.lugi.Lugi.repositories.CarroRepository;

@RestController
public class CarroController {
	
	@Autowired
	CarroRepository carroRepository; 
	

	@GetMapping("/carro")
	public Page<Carro> getCarro(Pageable pageable){
		return  carroRepository.findAll(pageable);
	}
	
	@PostMapping("/carro")
	public Carro createCarro(@Valid @RequestBody Carro carro) {
		return carroRepository.save(carro);
	}
	
	@PutMapping("/carro")
	public Carro updateCarro (@PathVariable Long carroId, 
			
            @Valid @RequestBody Carro carroRequest) {

			return carroRepository.findById(carroId)
			.map( carro -> {
			carro.setAno(carroRequest.getAno());
			carro.setCor(carroRequest.getCor());
			carro.setModelo(carroRequest.getModelo());
			carro.setQuilometragem(carroRequest.getQuilometragem());
			carro.setValorDaDiaria(carroRequest.getValorDaDiaria());
			return carroRepository.save(carro);
			}).orElseThrow(() -> new ResourceNotFoundException("FamilyMember not found: " + carroId));
			}
	
	
	@DeleteMapping("/carro")
}

package com.lugi.Lugi.controllers;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.exception.ResourceNotFoundException;
import com.lugi.Lugi.model.Locadora;
import com.lugi.Lugi.repositories.LocadoraRepository;

@RestController
public class LocadoraController {
	
	@Autowired
	LocadoraRepository locadoraRepository; 
	
	
    @GetMapping("/locadora")
    public Page<Locadora> getLocadora(Pageable pageable){
    	return locadoraRepository.findAll(pageable);
    }
    
	@PostMapping("/locadora")
	public Locadora createLocadora(@Valid @RequestBody Locadora locadora) {
		return locadoraRepository.save(locadora);
	}
	
	@PutMapping("/locadora")
	public Locadora updateLocadora(@PathVariable Long locadoraId, 
			
			 @Valid @RequestBody Locadora locadoraRequest) {

		return locadoraRepository.findById(locadoraId)
		.map( locadora -> {
		locadora.setCnpj(locadoraRequest.getCnpj());
		locadora.setContato(locadoraRequest.getContato());
		locadora.setEndereco(locadoraRequest.getEndereco());
		locadora.setCarros(locadoraRequest.getCarros());
		locadora.setClientes(locadoraRequest.getClientes());
		return locadoraRepository.save(locadora);
		}).orElseThrow(() -> new ResourceNotFoundException("FamilyMember not found: " + locadoraId));
		}
			
	@DeleteMapping("/locadora")
	public ResponseEntity<?> deleteQuestion(@PathVariable Long locadoraId){
		return locadoraRepository.findById(locadoraId)
				.map(locadora ->{
					locadoraRepository.delete(locadora);
					return ResponseEntity.ok().build();
				}).orElseThrow (() -> new  ResourceNotFoundException("FamilyMember not found: " + locadoraId));
	}
	

}

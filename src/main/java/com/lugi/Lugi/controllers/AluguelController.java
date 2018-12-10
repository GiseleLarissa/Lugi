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
	
	
	@GetMapping("/aluguel/{aluguelId}")
	public Aluguel getAluguel(@PathVariable Long aluguelId){
		return  aluguelRepository.findById(aluguelId)
		.orElseThrow(() -> new ResourceNotFoundException("ERRO: NÃO ENCONTRADO" + aluguelId));
	}
	
	
	@PostMapping("/aluguel")
	public Aluguel createAluguel(@Valid @RequestBody Aluguel aluguel) {
		return aluguelRepository.save(aluguel);
	}	
	
	@PutMapping("/aluguel/{aluguelId}")
	public Aluguel updateAluguel (@PathVariable Long aluguelId, 
			
			                                    @Valid @RequestBody Aluguel aluguelRequest) {
		
		return aluguelRepository.findById(aluguelId)
				.map(aluguel -> {
					aluguel.setData(aluguelRequest.getData());
					aluguel.setHora(aluguelRequest.getHora());
					aluguel.setValorDaDiaria(aluguelRequest.getValorDaDiaria());
					aluguel.setTipoPagamento(aluguelRequest.getTipoPagamento());
					return aluguelRepository.save(aluguel);
		}).orElseThrow(() -> new ResourceNotFoundException("ERRO: NÃO ENCONTRADO " + aluguelId));
	}
	
	@DeleteMapping("/aluguel/{aluguelId}")
	public ResponseEntity<?> deleteQuestion(@PathVariable Long aluguelId){
		return aluguelRepository.findById(aluguelId)
				.map(aluguel ->{
					aluguelRepository.delete(aluguel);
					return ResponseEntity.ok().build();
				}).orElseThrow (() -> new  ResourceNotFoundException("ERRO: NÃO ENCONTRADO " + aluguelId));

	}
				
}


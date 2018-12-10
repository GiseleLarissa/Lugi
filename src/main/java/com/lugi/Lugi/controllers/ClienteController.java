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
import com.lugi.Lugi.model.Cliente;
import com.lugi.Lugi.repositories.ClienteRepository;

@RestController
public class ClienteController {
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
    @GetMapping("/cliente")
    public Page<Cliente> getCliente(Pageable pageable){
		return  clienteRepository.findAll(pageable);
	}
    
    @GetMapping("/cliente/{clienteId}")
	public Cliente getCliente(@PathVariable Long clienteId){
		return  clienteRepository.findById(clienteId)
		.orElseThrow(() -> new ResourceNotFoundException("ERRO: NÃO ENCONTRADO  " + clienteId));
	}
    
	
	@PostMapping("/cliente")
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("/cliente/{clienteId}")
	public Cliente updateCliente(@PathVariable Long clienteId, 
			
            @Valid @RequestBody Cliente clienteRequest) {

			return clienteRepository.findById(clienteId)
			.map( cliente -> {
			cliente.setCpf(clienteRequest.getCpf());
			cliente.setNome(clienteRequest.getNome());
			cliente.setIdade(clienteRequest.getIdade());
			cliente.setContato(clienteRequest.getContato());
			cliente.setEmail(clienteRequest.getEmail());
			cliente.setAluguel(clienteRequest.getAluguel());
			return clienteRepository.save(cliente);
			}).orElseThrow(() -> new ResourceNotFoundException("ERRO: NÃO ENCONTRADO  " + clienteId));
			}
	
	@DeleteMapping("/cliente/{clienteId}")
	public ResponseEntity<?> deleteQuestion(@PathVariable Long clienteId){
		return clienteRepository.findById(clienteId)
				.map(cliente ->{
					clienteRepository.delete(cliente);
					return ResponseEntity.ok().build();
				}).orElseThrow (() -> new  ResourceNotFoundException("ERRO: NÃO ENCONTRADO  " + clienteId));

	}

}

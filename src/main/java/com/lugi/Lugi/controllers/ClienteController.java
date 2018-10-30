package com.lugi.Lugi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.lugi.Lugi.model.Cliente;
import com.lugi.Lugi.repositories.ClienteRepository;

@RestController
public class ClienteController {
	
	
	@Autowired
	ClienteRepository clienteRepository;
	
    @GetMapping("")
    public Page<Cliente> getCliente(Pageable pageable){
		return  clienteRepository.findAll(pageable);
	}
	
	@PostMapping("")
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping("")
	
	
	@DeleteMapping("")

}

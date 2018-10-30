package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PutMapping("")
	
	
	@DeleteMapping("")

}

package com.lugi.Lugi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.AluguelRepository;

@RestController
public class AluguelController {
	
	@Autowired
	private AluguelRepository aluguelRepository;
	
	

}

package com.lugi.Lugi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.LocadoraRepository;

@RestController
@RequestMapping("")
public class LocadoraResource {
	
	@Autowired
	LocadoraRepository locadoraRepository; 

}

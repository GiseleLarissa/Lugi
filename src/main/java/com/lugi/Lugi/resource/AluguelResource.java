package com.lugi.Lugi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lugi.Lugi.repositories.AluguelRepository;

@RestController
@RequestMapping("")
public class AluguelResource {
	
	@Autowired 
	AluguelRepository aluguelRepository;

}

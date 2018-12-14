package com.lugi.Lugi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugi.Lugi.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	public Cliente FindByUsuarioAndSenha(String usuario, String senha);

}

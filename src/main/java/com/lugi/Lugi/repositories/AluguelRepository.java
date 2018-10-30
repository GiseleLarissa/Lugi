package com.lugi.Lugi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugi.Lugi.model.Aluguel;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long>{

}

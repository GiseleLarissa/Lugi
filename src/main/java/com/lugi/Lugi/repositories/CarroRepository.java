package com.lugi.Lugi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugi.Lugi.model.Carro;

@Repository
public interface CarroRepository  extends JpaRepository<Carro, Long>{

}

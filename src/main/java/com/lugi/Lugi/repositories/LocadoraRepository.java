package com.lugi.Lugi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lugi.Lugi.model.Locadora;

@Repository
public interface LocadoraRepository extends JpaRepository<Locadora, Long> {

}

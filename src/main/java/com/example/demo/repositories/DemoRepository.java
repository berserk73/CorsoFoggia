package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.Persona;


public interface DemoRepository  extends JpaRepository<Persona, Long>{
	
	 List<Persona> findByNomeContainingIgnoreCase(String name);
	 
	 @Query("select a from Persona a where a.nome=:nome")
	 List<Persona> findByTest( @Param("nome") String nome);
}

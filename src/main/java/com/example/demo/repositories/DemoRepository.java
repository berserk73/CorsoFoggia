package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Persona;


public interface DemoRepository  extends JpaRepository<Persona, Long>{

}

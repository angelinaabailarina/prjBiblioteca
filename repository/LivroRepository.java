package com.example.ninoca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ninoca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}

package com.orange.microservice.ComposantService.ComposantService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.microservice.ComposantService.ComposantService.model.Composant;

public interface ComposantRepository extends JpaRepository<Composant, Integer> {
	Optional<Composant> findById(Integer Id);

	Optional<Composant> findByNom(String nom);
	

}

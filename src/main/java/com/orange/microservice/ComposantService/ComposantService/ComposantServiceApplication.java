package com.orange.microservice.ComposantService.ComposantService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComposantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComposantServiceApplication.class, args);
		System.out.println("Microservice démarré avec succés");
	}

}

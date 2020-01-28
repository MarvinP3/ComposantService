package com.orange.microservice.ComposantService.ComposantService.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.orange.microservice.ComposantService.ComposantService.repository.ComposantRepository;

import com.orange.microservice.ComposantService.ComposantService.model.Composant;


@RestController
public class ComposantController {
	//Récupérer la liste des composants
		@Autowired
		private ComposantRepository composantRepo;
	    @ResponseBody 
	    @RequestMapping(value="/Composant", method=RequestMethod.GET)
	    public List<Composant> listeUtilisateurs() {
	    return composantRepo.findAll();
	        
		}
	    //Récupérer un composant par son Id
	    @GetMapping(value="/Composant/{id}")
	    public Optional<Composant> afficherUnComposant(@PathVariable int id) {
	        Optional<Composant> UnComposant = composantRepo.findById(id);
	        return UnComposant;
	}
	    
	    @RequestMapping(value="/Composant", method=RequestMethod.POST)
	    public String createComposant(@RequestBody Composant unComposant) {
	    	composantRepo.save(unComposant);
	    	return "OK";
	    }
	    
	    
	    @RequestMapping(value="/Composant/{id}", method=RequestMethod.PUT)
	    public String modifierComposant(@RequestBody Composant unComposant) {
	    	composantRepo.save(unComposant);
	    	return " Un composant modifié";
	    }
	    
	    @RequestMapping(value="/Composant/{id}", method=RequestMethod.DELETE)
	    public String supprimerComposant(@PathVariable int id) {
	    	Composant unComposant = new Composant();
	    	unComposant.setId(id);
	    	composantRepo.delete(unComposant);
	    	return " Un composant supprimé";
	    }
	    
	
	    	
	    }
	



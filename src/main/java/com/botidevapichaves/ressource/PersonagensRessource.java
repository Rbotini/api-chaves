package com.botidevapichaves.ressource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botidevapichaves.models.Personagem;
import com.botidevapichaves.repository.PersonagensRepository;

@RestController
@RequestMapping(value = "/api")

public class PersonagensRessource{
	
	@Autowired
	PersonagensRepository personagensRepository;
	
	@GetMapping("/personagens")
	public List<Personagem>listar(){
		return personagensRepository.findAll();
		
	}
	
	@PostMapping("/personagens")
	public Personagem salvar(@RequestBody Personagem personagem) {
		return personagensRepository.save(personagem);
	}

}

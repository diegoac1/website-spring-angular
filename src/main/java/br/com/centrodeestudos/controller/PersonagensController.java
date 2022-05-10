package br.com.centrodeestudos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centrodeestudos.modelo.Personagem;
import br.com.centrodeestudos.repository.PersonagemRepository;

@RestController

@RequestMapping(value="/api/personagens")
public class PersonagensController {

	@Autowired
	private PersonagemRepository personagemRepository;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping
	public List<Personagem> lista() {
		List<Personagem> personagens = personagemRepository.findAll();
		return personagens;
	}
	
}

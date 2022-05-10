package br.com.centrodeestudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centrodeestudos.modelo.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long>{

}

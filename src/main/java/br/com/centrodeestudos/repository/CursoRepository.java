package br.com.centrodeestudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centrodeestudos.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}

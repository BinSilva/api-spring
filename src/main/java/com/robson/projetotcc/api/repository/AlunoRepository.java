package com.robson.projetotcc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robson.projetotcc.api.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	Aluno findById(long id);

}

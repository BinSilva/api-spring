package com.robson.projetotcc.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robson.projetotcc.api.model.Aluno;
import com.robson.projetotcc.api.repository.AlunoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Alunos")
@CrossOrigin(origins="*")
public class AlunoResource {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@GetMapping("/alunos")
	@ApiOperation(value="Retorna uma lista dos alunos")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("/alunos/{id}")
	@ApiOperation(value="Retorna aluno por id")
	public Aluno listaAlunosForId(@PathVariable(value="id") long id){
		return alunoRepository.findById(id);
	}
	
	@PostMapping("/alunos")
	@ApiOperation(value="Salva um aluno")
	public Aluno salvaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping("/alunos")
	@ApiOperation(value="Deleta um aluno")
	public void deletaAluno(@RequestBody Aluno aluno) {
		alunoRepository.delete(aluno);
	}
	
	@PutMapping("/alunos")
	@ApiOperation(value="Atualiza um aluno")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

}

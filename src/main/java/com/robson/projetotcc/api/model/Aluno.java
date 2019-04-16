package com.robson.projetotcc.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ALUNO")
public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;	
	private String email;	
	private Float nota1;	
	private Float nota2;	
	private Float nota3;	
	private Float média;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getNota1() {
		return nota1;
	}
	public void setNota1(Float nota1) {
		this.nota1 = nota1;
	}
	public Float getNota2() {
		return nota2;
	}
	public void setNota2(Float nota2) {
		this.nota2 = nota2;
	}
	public Float getNota3() {
		return nota3;
	}
	public void setNota3(Float nota3) {
		this.nota3 = nota3;
	}
	public Float getMédia() {
		return média;
	}
	public void setMédia(Float média) {
		this.média = média;
	}
	
}

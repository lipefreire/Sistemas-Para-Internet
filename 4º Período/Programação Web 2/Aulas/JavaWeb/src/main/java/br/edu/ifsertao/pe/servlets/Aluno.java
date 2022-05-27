package br.edu.ifsertao.pe.servlets;

import java.io.Serializable;

public class Aluno implements Serializable {
	private String nome;
	private String matricula;
	
	//CONSTRUTOR 
	public Aluno(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}

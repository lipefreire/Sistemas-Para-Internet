package br.edu.ifsertaope.salgueiro.model;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class Aluno implements Serializable {
	private int matricula;
	private String nome, endereco, telefone, email;
	private Date dataCadastro;
	
	public Aluno() {
		
	}

	public Aluno(int matricula, String nome, String endereco, String telefone, String email, Date dataCadastro) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.email = email;
	}
	
	public Aluno(String nome, String endereco, String telefone, String email, Date dataCadastro) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.email = email;
	}
	

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone
				+ ", dataCadastro=" + dataCadastro + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

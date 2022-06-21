package br.edu.ifsertaope.salgueiro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifsertaope.salgueiro.model.Aluno;
import br.edu.ifsertaope.salgueiro.util.DBConexao;

public class AlunoDao {
	private Connection conectar;
	
	public AlunoDao() {
		conectar = DBConexao.getConnection();
	}
	
	//CRUD
	public void adicionarAluno(Aluno aluno) {
		try {
			PreparedStatement ps = conectar.prepareStatement(
					"insert into tb_aluno (nome, telefone, email, dtcadastro )"
					+ "values (?, ?, ?, ?)");
			
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getTelefone());
			ps.setString(3, aluno.getEmail());
			ps.setDate(4, new java.sql.Date(aluno.getDataCadastro()));
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

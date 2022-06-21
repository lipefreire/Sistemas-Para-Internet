package com.mycompany.agenda2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContatosDAO {
    
    //public Contatos c;
    public Conexao conexao;
    
    private Connection con;
    private PreparedStatement psts;
    private ResultSet rs;
    
    public ContatosDAO(){
        conexao = new Conexao();
        //c = new Contatos();
    }
    
    public void salvar(Contatos c) throws Exception {
		String sql = "INSERT INTO contatos (nome, idade, dataCadastro) VALUES (?,?,?);";
		
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.execute();
	}
	
	public void atualizar(Contatos c) throws Exception {
		String sql = "UPDATE contatos " +
				"SET nome = ?, idade = ?, dataCadastro = ? " +
				"WHERE id = ?;";
		
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.setInt(4, c.getId());
		psts.execute();
	}
	
	public void excluir(Contatos c) throws Exception {
		String sql = "DELETE FROM contatos "
				+ "WHERE id = ?;";
		
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);
		
		psts.setInt(1, c.getId());
		psts.execute();
	}
	
	public Contatos consultarPorId(int id) throws Exception {
		String sql = "SELECT * FROM contatos WHERE id = ?;";
		Contatos c = new Contatos();
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);				
		psts.setInt(1, id);
		rs = psts.executeQuery();
		
			while (rs.next())
			{  
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString(2));
				c.setIdade(rs.getInt(3));
				c.setDataCadastro(rs.getString(4));
			}
			
			rs.close();
			psts.close();	
			return c;
	}	
	
	public List<Contatos> consultar() throws Exception {
		String sql = "SELECT nome FROM contatos;";
		
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);
		rs = psts.executeQuery();
		
		Contatos contatos = new Contatos();
		List<Contatos> cont = new ArrayList<>();
		
		while (rs.next()) {
			contatos.setId(rs.getInt("id"));
			contatos.setNome(rs.getString("Nome"));
			contatos.setIdade(3);
			contatos.setDataCadastro(rs.getString(4));
			cont.add(contatos);
		}
		psts.execute();	
                rs.close();	
                psts.close();
		return cont;
	}	
	
	public List<Contatos> getContatos() throws Exception{
		String sql = "SELECT * FROM contatos";		
		List<Contatos> cont = new ArrayList<>();
		
		con = Conexao.conexaoMySQL();
		psts = con.prepareStatement(sql);
		rs = psts.executeQuery();
		Contatos contatos  = new Contatos();
		
		while (rs.next()) {
			contatos.setId(rs.getInt("id"));
			contatos.setNome(rs.getString("nome"));
			contatos.setIdade(rs.getInt("idade"));
			contatos.setDataCadastro(rs.getString("dataCadastro"));
			cont.add(contatos);
			System.out.println(contatos.getNome());
		}
		return cont;		
	}
}

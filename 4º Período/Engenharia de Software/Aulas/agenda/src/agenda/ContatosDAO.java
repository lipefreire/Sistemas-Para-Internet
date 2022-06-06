package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatosDAO {
	public void salvar(Contatos c) throws Exception {
		String sql = "INSERT INTO contatos (nome, idade, dataCadastro) VALUES (?, ?, ?);";
		
		Connection con = null;
		PreparedStatement psts = null;
		
		con = Conexao.ConexaoMySQL();
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
		
		Connection con = Conexao.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.setInt(4, c.getId());
		psts.execute();
	}
	
	public void excluir(Contatos c)throws Exception {
		String sql = "DELETE FROM contatos WHERE id = ?;";
		
		Connection con = Conexao.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.setInt(4, c.getId());
		psts.execute();
	}
}
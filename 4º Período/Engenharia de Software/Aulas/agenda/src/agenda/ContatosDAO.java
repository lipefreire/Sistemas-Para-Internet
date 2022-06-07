package agenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

	public Contatos consultaPorId(int id)throws Exception{
		String sql = "SELECT nome FROM contatos WHERE id = ?;";
		
		Connection con = Conexao.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		ResultSet rs = psts.executeQuery();
		Contatos c = new Contatos();
		
		psts.setInt(1, c.getId());
		
		while (rs.next()) {
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("Nome"));
			c.setId(rs.getInt(3));
			c.setDataCadastro(rs.getString(4));
		}
		psts.execute();
		rs.close();
		psts.close();
		return c;
	}
	
	public List<Contatos> consultar()throws Exception{
		String sql = "SELECT nome FROM contatos WHERE id = ?;";
		
		Connection con = Conexao.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		ResultSet rs = psts.executeQuery();
		
		Contatos c = new Contatos();
		
		List<Contatos> cont = new ArrayList<>();
		
		while (rs.next()) {
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("Nome"));
			c.setId(rs.getInt(3));
			c.setDataCadastro(rs.getString(4));
			cont.add(c);
		}
		psts.execute();
		rs.close();
		psts.close();
		return cont;
	}
}
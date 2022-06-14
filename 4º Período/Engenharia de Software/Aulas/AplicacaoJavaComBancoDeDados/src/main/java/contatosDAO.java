import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class contatosDAO {
	public void salvar(contatos c) throws Exception {
		String sql = "INSERT INTO contatos (nome, idade, dataCadastro) VALUES (?, ?, ?);";
		
		Connection con = null;
		PreparedStatement psts = null;
		
		con = BD.ConexaoMySQL();
		psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.execute();
	}
	
	public void atualizar(contatos c) throws Exception {
		String sql = "UPDATE contatos " + 
				"SET nome = ?, idade = ?, dataCadastro = ? " + 
				"WHERE id = ?;";
		
		Connection con = BD.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.setInt(4, c.getId());
		psts.execute();
	}
	
	public void excluir(contatos c)throws Exception {
		String sql = "DELETE FROM contatos WHERE id = ?;";
		
		Connection con = BD.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		
		psts.setString(1, c.getNome());
		psts.setInt(2, c.getIdade());
		psts.setString(3, c.getDataCadastro());
		psts.setInt(4, c.getId());
		psts.execute();
	}

	public contatos consultaPorId(int id)throws Exception{
		String sql = "SELECT nome FROM contatos WHERE id = ?;";
		
		Connection con = BD.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		ResultSet rs = psts.executeQuery();
		contatos c = new contatos();
		
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
	
	public List<contatos> consultar()throws Exception{
		String sql = "SELECT nome FROM contatos WHERE id = ?;";
		
		Connection con = BD.ConexaoMySQL();
		PreparedStatement psts = con.prepareStatement(sql);
		ResultSet rs = psts.executeQuery();
		
		contatos c = new contatos();
		
		List<contatos> cont = new ArrayList<>();
		
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
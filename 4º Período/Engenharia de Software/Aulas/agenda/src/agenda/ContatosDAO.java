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
}

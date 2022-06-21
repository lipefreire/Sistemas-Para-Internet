package br.edu.ifsertaope.salgueiro.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConexao {
	private static Connection conexao = null;

	public static Connection getConnection() {
		if(conexao != null) {
			return conexao;
		}
		else {
			try {
				Properties properties = new Properties();
				InputStream inputStream =
						
				//DADOS DE CONEXÃO
				DBConexao.class.getClassLoader().
				getResourceAsStream("/configbd.properties");
				properties.load(inputStream);

				String driver = properties.getProperty("driver");
				String caminho = properties.getProperty("url");
				String usuario = properties.getProperty("user");
				String senha = properties.getProperty("password");
				
				//EXECUTAR A CONEXÃO
				Class.forName(driver);
				conexao = DriverManager.getConnection(caminho, usuario, senha);
			}
			catch(SQLException e) {
				e.printStackTrace();
				
			}
			catch(IOException e){
				e.printStackTrace();
				
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
				
			}
			return conexao;
		}
	}
}

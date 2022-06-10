package br.edu.ifsertaope.salgueiro.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
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
				DBConexao.class.getClassLoader().
				getResourceAsStream("/configbd.properties");
				properties.load(inputStream);
				
				String driver = properties.getProperty("driver");
				String url = properties.getProperty("url");
				String user = properties.getProperty("user");
				String password = properties.getProperty("password");
				
				Class.forName(driver);
				conexao = DriverManager.getConnection(url, user, password);
			}
			catch(Exception e) {
				
			}
		}
	}
}

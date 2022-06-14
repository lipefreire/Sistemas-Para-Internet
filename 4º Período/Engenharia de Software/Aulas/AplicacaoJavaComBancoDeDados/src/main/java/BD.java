import java.sql.Connection;
import java.sql.DriverManager;

public class BD {
    public static Connection ConexaoMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
				"root", "alunoif21");
		return con;
    }
}

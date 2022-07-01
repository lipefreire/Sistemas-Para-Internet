import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProtocoloDAO {
    public void emitir(Protocolo p) throws Exception{
    	String sql = "INSERT INTO protocolo (dataEmissaoProtocolo, dataInicioExperimento, "
    			+ "dataFimExperimento, justificativaUsoAnimais, resumoPortugues, resumoIngles, "
    			+ "statusParecer) "
    			+ "VALUES (?, ?, ?, ?, ?, ?, 'Aguardando Envio');";
    	
    	Connection con = null;
    	PreparedStatement psts = null;
    	
    	con = Conexao.ConexaoMySQL();
    	psts = con.prepareStatement(sql);
    	
    	psts.setString(1, p.getDataEmissaoProtocolo());
    	psts.setString(2, p.getDataInicioExperimento());
    	psts.setString(3, p.getDataFimExperimento());
    	psts.setString(4, p.getJustificativaUsoAnimais());
    	psts.setString(5, p.getResumoPortugues());
    	psts.setString(6, p.getResumoIngles());
    	psts.execute();
    }
    
    public void enviarParecer(Protocolo p) throws Exception{
    	String sql = "INSERT INTO (statusParecer) VALUES (Enviado);";
    }
    
    public void emitirParecer(Protocolo p) throws Exception{
    	String sql = "INSERT INTO";
    }
}
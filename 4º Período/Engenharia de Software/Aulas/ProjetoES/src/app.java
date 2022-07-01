
public class app {

	public static void main(String[] args) {
		ProtocoloDAO protocoloDAO = new ProtocoloDAO();
		Protocolo protocolo = new Protocolo();
		
		//EMITIR PROTOCOLO
		Protocolo protocolos = new Protocolo();
		protocolos.setDataEmissaoProtocolo("2022-06-28");
		protocolos.setDataInicioExperimento("2022-06-28");
		protocolos.setDataFimExperimento("2022-06-28");
		protocolos.setJustificativaUsoAnimais("São bonitos");
		protocolos.setResumoPortugues("Uso de animais");
		protocolos.setResumoIngles("Use of animals");
		try {
			protocoloDAO.emitir(protocolos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

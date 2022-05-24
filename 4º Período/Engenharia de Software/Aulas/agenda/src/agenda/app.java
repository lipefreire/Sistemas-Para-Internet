package agenda;

public class app {

	public static void main(String[] args) throws Exception {
		ContatosDAO contatosDAO = new ContatosDAO();

		Contatos contatos = new Contatos();	
		contatos.setNome("CONTATO 001");
		contatos.setIdade(10);
		contatos.setDataCadastro("2022-05-24");
		contatosDAO.salvar(contatos);
		
		Contatos contatos2 = new Contatos();	
		contatos2.setNome("CONTATO 002");
		contatos2.setIdade(18);
		contatos2.setDataCadastro("2022-05-24");
		contatosDAO.salvar(contatos2);
	}

}

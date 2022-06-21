package com.mycompany.agenda2;

/**
 *
 * @author franc
 */
public class Agenda2 {

    public static void main(String[] args) throws Exception {
        ContatosDAO contatosDAO = new ContatosDAO();
        Contatos c1 = new Contatos();
        
        c1.setNome("Walter José");
        c1.setIdade(23);
        c1.setDataCadastro("2022-06-21");
        /*
        c1.setId(9);
        
        System.out.println(contatosDAO.consultarPorId(7).getId());
        System.out.println(contatosDAO.consultarPorId(7).getNome());
        System.out.println(contatosDAO.consultarPorId(7).getIdade());
        System.out.println(contatosDAO.consultarPorId(7).getDataCadastro());
        */
        
        contatosDAO.salvar(c1);
    }
}

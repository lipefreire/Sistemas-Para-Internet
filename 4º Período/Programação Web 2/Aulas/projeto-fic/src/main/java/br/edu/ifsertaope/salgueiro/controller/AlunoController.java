package br.edu.ifsertaope.salgueiro.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifsertaope.salgueiro.dao.AlunoDao;
import br.edu.ifsertaope.salgueiro.model.Aluno;

/**
 * Servlet implementation class AlunoController
 */
@WebServlet("/alunocontroller")
public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlunoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String sucesso = "sucesso.jsp";
		List<Aluno> lista = new ArrayList<Aluno>;
		
		Aluno aluno = new Aluno();
		AlunoDao dao = new AlunoDao();
		
		try (!acao.equalsIgnoreCase("Listar")){
			aluno.setNome("nome");
			aluno.setTelefone("telefone");
			aluno.setEmail("email");
			
			
		}
		catch(Exception e){
			
		}
		)
	}

}

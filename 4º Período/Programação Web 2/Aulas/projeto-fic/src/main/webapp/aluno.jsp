<form method="post" action="AlunoController">
			<fieldset>
				<legend>Cadastro de Alunos: </legend>
                
                <label>Nome:</label>
                <input name="nome" autofocus="autofocus" placeholder="Nome" value="${aluno.nome}" /><br /> 
				
				<label>Telefone:</label>
				<input type="tel" name="telefone" placeholder="xx99999999" value="${aluno.telefone}" /><br /> 
					
				<label>Email:</label>
				<input type="email" name="email" placeholder="andre@feltex.com.br" value="${aluno.email}" /><br /> 
					
				<label>Data Cadastro:</label>
				<input type="date" name="dataCadastro" value="${aluno.dataCadastro}" placeholder="10/10/2014" /><br /> 
					
				<label>Ação</label> 
					<select name="acao" required>
						<option selected value="Incluir">Incluir</option>
						<option value="Alterar">Alterar</option>
						<option value="Excluir">Excluir</option>
						<option value="Consultar">Consultar</option>
					</select><br /> 
				<input type="submit" value="Enviar"> <input type="reset" value="Limpar"> <br />
			</fieldset>
		</form>
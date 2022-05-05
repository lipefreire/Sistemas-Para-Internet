# 1ª Questão
SELECT * FROM autores;

# 2ª Questão
SELECT * FROM editoras;

# 3ª Questão
SELECT * FROM funcionarios;

# 4ª Questão
SELECT * FROM livros;

# 5ª Questão
SELECT * FROM usuarios;

# 6ª Questão
DESC livros;
SELECT titulo, genero FROM livros;

# 7ª Questão
SELECT * FROM funcionarios;
SELECT nome, salario, (salario * 1.3) AS "Novo salário" 
FROM funcionarios;

# 8ª Questão
SELECT * FROM funcionarios;
SELECT nome, salario, (salario + 615) AS "Salario com Adicional de 615"
FROM funcionarios;

# 9ª Questão
SELECT * FROM autores;
SELECT nacionalidade FROM autores;

# 10ª Questão
SELECT * FROM funcionarios;
SELECT endereco, AVG(salario) FROM funcionarios
GROUP BY endereco HAVING AVG(salario) > 1.000;

# 11ª Questão
SELECT * FROM livros;
SELECT titulo, ano_publicacao FROM livros
ORDER BY ano_publicacao;

# 12ª Questão
SELECT * FROM funcionarios;
SELECT endereco, salario, SUM(salario) FROM funcionarios WHERE endereco = "Campinas";

# 13ª Questão
SELECT * FROM funcionarios;
SELECT endereco, MIN(salario) FROM funcionarios;

# 14ª Questão
DESC livros;
SELECT cpf_funcionario FROM livros WHERE cpf_funcionario IS NOT NULL;

# 15ª Questão
SELECT * FROM livros;
SELECT titulo, genero FROM livros WHERE cpf_usuarioReservar IS NULL;

# 16ª Questão
SELECT nome FROM funcionarios WHERE nome LIKE 'A%';

# 17ª Questão
SELECT nome FROM funcionarios WHERE nome LIKE '%ana%';

# 18ª Questão
SELECT nome FROM funcionarios WHERE nome LIKE '%s';

# 19ª Questão
SELECT * FROM livros;
SELECT titulo, edicao FROM livros WHERE edicao = 1 OR edicao = 5 OR edicao = 10 OR edicao = 20;

# 20ª Questão
SELECT * FROM funcionarios;
SELECT nome, funcao FROM funcionarios WHERE funcao IS NOT NULL;

# 21ª Questão
SELECT nome, salario FROM funcionarios WHERE salario >= 1.000 AND salario <= 1.500;
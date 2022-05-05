#1ª Questão - 

CREATE TABLE Funcionarios(
	idFuncionario INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(20) NOT NULL,
	sobrenome VARCHAR(20) NOT NULL,
	cargo VARCHAR(20) NOT NULL,
	idade INT(2) NOT NULL,
	tempoServico INT(2) NOT NULL,
	salario DECIMAL(20,2) NOT NULL
);

INSERT INTO Funcionarios (nome, sobrenome, cargo, idade, tempoServico, salario)
	VALUES
		('Jose', 'Soares', 'Programador', 29, 3, 7000),
		('Calleb', 'Bezerra', 'Programador', 31, 3, 7000),
		('Vitoria', 'Mickele', 'Designer', 18, 1, 3000),
		('Alexandre', 'Freire', 'Programador', 19, 3, 7000),
		('Marcelo', 'Santos', 'Senior', 32, 5, 8000),
		('Alvaro', 'Silva', 'Gerente', 40, 10, 10000),
		('Flavia', 'Lucas', 'Advogada', 28, 4, 8000),
		('Iane', 'Larissa', 'Advogada', 22, 4, 8000),
		('Paloma', 'Lucas', 'Social Media', 22, 1, 3000),
		('Jose', 'Martins', 'Analista', 25, 2, 3000),
		('Jeremias', 'Batista', 'Quality Checker', 25, 2, 3000),
		('Felipe', 'Esdras', 'Gerente', 22, 3, 7000),
		('Sabrina', 'Lucas', 'YouTuber', 28, 3, 7000);	

# LETRA "A"

DELETE FROM funcionarios WHERE sobrenome = 'Soares';

SELECT nome AS Nome, sobrenome AS Sobrenome, cargo AS Cargo 
	FROM funcionarios 
	WHERE cargo = 'Programador'
    
#LETRA "B"

SELECT nome Nome, sobrenome Sobrenome, tempoServico AS 'Tempo de Serviço'
	FROM funcionarios
	WHERE tempoServico < 3;
    
#LETRA "C"

SELECT nome Nome, sobrenome Sobrenome
	FROM funcionarios
	WHERE nome LIKE 'J%';
    
#LETRA "D" 

SELECT nome Nome, sobrenome Sobrenome, cargo Cargo
	FROM funcionarios
	WHERE cargo = 'Senior';

#LETRA "E"

SELECT nome Nome, sobrenome Sobrenome, salario 'Salário'
	FROM funcionarios
	WHERE salario >= 7000 AND salario <=9000
	ORDER BY salario DESC;
    
#LETRA "F" 

SELECT nome Nome, sobrenome Sobrenome, idade Idade
	FROM funcionarios
	WHERE sobrenome LIKE 'A%' OR sobrenome LIKE 'S%'
	AND idade < 30;
    
#LETRA "G" 

SELECT nome Nome, sobrenome Sobrenome, cargo Cargo
	FROM funcionarios
	WHERE NOT cargo = 'Programador'
	ORDER BY cargo ASC;
    
#LETRA "H"

SELECT nome Nome, sobrenome Sobrenome, idade Idade 
	FROM funcionarios
	ORDER BY idade DESC
	LIMIT 4;
    
#2ª Questão - 

CREATE TABLE curso(
	codigo VARCHAR(4) NOT NULL PRIMARY KEY,
	nome VARCHAR(40) NOT NULL,
	creditos INT(4) NOT NULL,
	valor DECIMAL(5,2) NOT NULL
);

INSERT INTO curso 
	VALUES
	('10-A', 'Sistemas Operacionais', 6, 200),
	('20-B', 'Redes', 12, 350),
	('10-C', 'Java', 10, 200),
	('30-A', 'Banco de Dados', 10, 300),
	('40-B', 'Computação Gráfica', 6, 250),
	('20-C', 'Orientação a Objetos', 6, 200),
	('11-A', 'Inteligência Artificial', 12, 300),
	('35-C', 'Projeto de Software', 8, 350),
	('56-E', 'Qualidade de Software', 12, 400);
    
#LETRA "A"
SELECT nome Nome_Curso, creditos Créditos, valor Preço FROM curso;

#LETRA "B"
SELECT distinct creditos Créditos FROM curso;

#LETRA "C"
SELECT codigo, nome, valor FROM curso WHERE valor BETWEEN 300 AND 400;

#LETRA "D" 
SELECT nome FROM curso WHERE nome LIKE '%Software%';

#LETRA "E"
SELECT nome 'Nome do Curso', valor Valor FROM curso WHERE valor <= 300 ORDER BY valor DESC;

#LETRA "F" 
SELECT nome Nome, creditos 'Créditos', (creditos+6) AS 'Novos créditos' FROM curso;

#LETRA "G" 
SELECT nome, creditos, valor FROM curso WHERE creditos = 6 AND valor > 200;


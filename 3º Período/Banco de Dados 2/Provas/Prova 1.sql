DROP DATABASE Prova1;
CREATE DATABASE Prova1;
USE Prova1;

SET FOREIGN_KEY_CHECKS=0;

CREATE TABLE Cliente(
	cpf INT PRIMARY KEY,
    nome VARCHAR(30),
    numConta INT,
    telefone CHAR(20),
    cidade CHAR(20)
);

CREATE TABLE Carro(
	chassi CHAR(11) PRIMARY KEY,
    modelo CHAR(20),
    cor CHAR(20),
    ano INT,
    valor INT
);

CREATE TABLE Aluguel(
	cpf INT,
    chassi CHAR(11),
    dataEntrada DATE,
    dataSaida DATE,
    total INT,
    PRIMARY KEY (chassi,cpf),
    FOREIGN KEY (cpf) REFERENCES Cliente(cpf),
	FOREIGN KEY (chassi) REFERENCES Carro(chassi)
);

	INSERT INTO cliente (cpf, nome, numConta, telefone, cidade) VALUES
		(111111, 'Ana', '2317', '019', 'Campinas'),
		(222222, 'Fábio', '1711', '019', 'Jundiaí'),
		(121111, 'Maria', '7121', '011', 'São Paulo'),
		(321222, 'Flávio', '2211', '019', 'Campinas'),
		(123111, 'Fernando', '1123', '031', 'Rio de Janeiro'),
		(217222, 'Marta', '3211', '021', 'Belo Horizonte');
    
    INSERT INTO Carro (chassi, modelo, cor, ano) VALUES
		('A21', 'Uno', 'Prata', '2003'),
        ('2AC', 'Gol', 'Preto', '2004'),
        ('33A', 'Corsa', 'Branco', '2005'),
        ('12C', 'Uno', 'Verde', '2001'),
        ('1C2', 'Astra', 'Prata', '2005'),
        ('22A', 'Gol', 'Prata', '2005');
        
	INSERT INTO Aluguel (cpf, chassi, dataEntrada, dataSaida) VALUES
		('111111', '33A', "2006-07-21", '2006-08-05'),
		('222222', '12C', "2006-07-21", NULL),
		('222222', '33A', "2006-07-23", '2006-08-06'),
		('222222', '1C2', "2006-07-24", NULL);

/*          LETRA C           */        
INSERT INTO Carro (valor, cor, ano, chassi, modelo) VALUES (12000, "Branco", 2021, "25C", "Corolla");

/*          LETRA D           */
UPDATE Cliente SET nome = "André" WHERE cpf = "321222";

/*          LETRA E           */
UPDATE Carro SET cor = "Azul" WHERE modelo = "Uno" OR modelo = "Corsa";

/*          LETRA F           */
DELETE FROM Cliente WHERE cidade = "Campinas";

/*          LETRA G           */
DELETE FROM Carro WHERE ano = 2003 OR ano = 2004;

/*          LETRA H           */
DELETE FROM Aluguel;

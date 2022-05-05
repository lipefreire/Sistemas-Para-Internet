CREATE DATABASE atv1_sql;
USE atv1_sql;

CREATE TABLE Autores
(
	codigo int(11) not null,
    nome varchar(45) not null,
    PRIMARY KEY (codigo)
);

CREATE TABLE Editoras
(
	codigo int(11) not null,
	nome varchar(45) not null,
	endereco varchar(45) null,
	contato varchar(45) null,
    PRIMARY KEY (codigo)
);

CREATE TABLE Funcionários
(
	cpf bigint(11) not null,
    nome varchar(45) not null,
	endereco varchar(45) null,
    telefone bigint(11) not null,
    salario decimal(10,0) null,
    funcao varchar(45) null,
    PRIMARY KEY (cpf)
);

CREATE TABLE Livros
(
	numero int(11) not null,
    titulo varchar(100) not null,
    genero varchar(45) not null,
    edicao smallint(4) not null,
    ano_publicacao year(4) not null,
    cpf_funcionario bigint(11) null,
    codigo_editora int(6) null,
    cpf_usuarioReservar BIGINT NOT NULL,
    CONSTRAINT pk_num PRIMARY KEY(numero)
);

CREATE database IF NOT EXISTS dados;

CREATE table usuarios(
	cpf BIGINT NOT NULL,
    nome VARCHAR(45) NOT NULL,
    endereco VARCHAR(45) NOT NULL,
    telefone BIGINT NOT NULL,
    CONSTRAINT pk_cpf PRIMARY KEY(cpf)
);

CREATE database IF NOT EXISTS autores_livros;

CREATE table livros_autores (
	numero_livro INT NOT NULL,
    codigo_autor INT NOT NULL,
    
    CONSTRAINT numlivro PRIMARY KEY(numero_livro, codigo_autor)
);
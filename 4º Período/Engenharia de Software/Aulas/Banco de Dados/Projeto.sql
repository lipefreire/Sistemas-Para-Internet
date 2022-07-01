use projeto;

CREATE TABLE protocolo(
	dataEmissaoProtocolo DATE NOT NULL,
    dataInicioExperimento DATE NOT NULL,
    dataFimExperimento DATE NOT NULL,
    JustificativaUsoAnimais VARCHAR(500) NOT NULL,
    resumoPortugues VARCHAR(500) NOT NULL,
    resumoIngles VARCHAR(500) NOT NULL,
    dataEnvioParecer DATE,
    dataEmissaoParecer DATE,
    descricaoParecer VARCHAR(500),
    statusParecer VARCHAR(500) ,
    dataDeliberacaoProtocolo DATE,
    statusDeliberacao VARCHAR(500),
    statusProtocolo VARCHAR(500)
);

CREATE TABLE tbl_teste_incremento (
Codigo SMALLINT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(20) NOT NULL
) AUTO_INCREMENT = 15;

select * from protocolo;
drop table protocolo;

desc protocolo;
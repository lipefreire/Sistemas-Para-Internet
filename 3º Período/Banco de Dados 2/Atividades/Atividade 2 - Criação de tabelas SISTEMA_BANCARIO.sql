CREATE database sistema_bancario;
use sistema_bancario;

create table caixaMovimento(
	lancamentoCaixa integer primary key auto_increment,
    codigoHistorico tinyint default 0,
    documento varchar(12) not null default "",
    data_movimento date not null,
    valor real(7,2) not null
);

create table bancoMovimento(
	lancamentoBanco integer primary key auto_increment,
    conta real(12,1) not null,
    lancamentoCaixa smallint not null,
    dataa date not null,
    tipoLancamento char(1) not null default "",
    valor real(7,2) not null
);

create table HistoricoPadrao(
	codigoHistorico tinyint(3) primary key auto_increment,
    descricao varchar(80) not null default ""
);

create table ContaBanco(
	conta real(12,1) not null primary key,
    agencia real(5,1) not null default 0.0,
    nomeBanco varchar(40) not null default ""
);

create table ContasPagarReceber(
	lancamentoContaPG smallint not null primary key auto_increment,
    codigoHistorico smallint(3) not null default 0,
    dataVencimento date not null,
    documento varchar(12) not null default "",
    valor real(7,2) not null default 0.00,
    tipo char(2) not null default "",
    situacao char(2) not null default ""
);
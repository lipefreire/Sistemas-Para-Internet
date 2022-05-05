CREATE database ATIVIDADE2;
use ATIVIDADE2;

create table NOTA_FISCAL(
	numero varchar(8) not null primary key,
    data_ date not null,
    total_nota_fiscal numeric(6,2) not null
);

create table ITENS_NOTA_FISCAL(
	numero numeric(12,0) primary key,
    codigo_produto integer not null,
    numero_nota_fiscal varchar(8) not null,
    quantidade numeric(8,2) not null,
    valor_item numeric(8,2) not null,
    total_item numeric(8,2) not null
);

create table PRODUTOS(
	codigo integer not null primary key,
    nome varchar(80) not null,
    nome_fantasia varchar(20),
    estoque_minimo numeric(14,4),
    data_cadastro date not null
);


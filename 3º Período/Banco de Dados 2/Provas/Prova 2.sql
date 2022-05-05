create database loja_roupas;
use loja_roupas;

create table marcas(
	codigo int not null,
    nome varchar(45) not null,
    primary key(codigo)
);

create table categorias(
	codigo int not null,
    descricao varchar(45) not null,
    primary key(codigo)
);

drop table produtos;
create table produtos(
	codigo int not null,
    descricao varchar(45) not null,
    preco_custo decimal(10, 2) not null,
    preco_venda decimal(10,2) not null,
    qtde_estoque int,
    qtde_minima int,
    cod_categoria int not null,
    cod_marca int not null,
    primary key(codigo)
);

insert into marcas
values
	(1, 'Nike'),
    (2, 'Adidas'),
    (3, 'Reebok');
    
insert into categorias
values
	(1, 'Confecção'),
    (2, 'Calçados'),
	(3, 'Bolas');
    
insert into produtos
values
	(1, 'Camisa Brasil', 100.00, 160.00, 18, 6, 1, 1),
    (2, 'Bola Adidas', 159.65, 240.99, 2, 3, 3, 5),
    (3, 'Bola de Tênis c/ 3', 11.65, 18.98, 1, 2, 1, 2),
    (4, 'Chuteira de couro', 90.78, 170.32, 8, 6, 8, 3);
    
#Retorne o nome dos produtos, preço de custo, valor de venda e o valor do lucro (valor de venda - preço de custo) para os produtos da categoria 1. 
select descricao, preco_custo, preco_venda, (preco_venda - preco_custo) as valor_lucro
from produtos where codigo IN (1);

#Retorne o nome dos produtos, seu preço e nome das marcas para produtos abaixo de 200,00.
select p.descricao, p.preco_venda, m.nome 
from marcas as m, produtos as p
where preco_venda < 200;

#Retorne o nome do produto, o nome da categoria e a quantidade em estoque para produtos que possuem Bola no nome.
select p.descricao, c.descricao, p.qtde_estoque
from produtos as p, categorias as c
where p.descricao like '%Bola%';



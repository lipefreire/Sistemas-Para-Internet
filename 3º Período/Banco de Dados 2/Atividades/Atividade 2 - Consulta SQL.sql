#1
select * FROM cliente;

#2
select produto_nome FROM produto;

#3
select distinct cliente_end_cidade, estado_codigo, cliente_end_cep FROM cliente;

#4
select * FROM pedido
where cliente_id = 09 and pedido_valor_total > 50.0;

#5 
select * FROM pedido
where pedido_valor_total < 100 or pedido_valor_total > 500;

#6
select * FROM pedido
where pedido_data_entrada = '99/12/04';

#7
select * FROM pedido
where (pedido_valor_total between 20 and 50) and pedido_data_entrada = '99/12/02';

#8
select * FROM cliente
where cliente_id not between 5 and 25;

#9
select * FROM produto 
where produto_nome like 'P%';

#10
select * FROM produto
where produto_nome like '%an%';

#11
select * FROM produto
where produto_nome like 'C%' or produto_nome like 'F%' or produto_nome like 'M%';
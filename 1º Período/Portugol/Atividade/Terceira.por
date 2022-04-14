programa
{
	
	funcao inicio()
	{
		real valor

		escreva("Digite o valor do produto em reais: \n")
		leia(valor)

	
		se(valor < 10 ){
			escreva("O valor da venda será de :",valor+(valor/100)*70," reais")
		}senao se(valor < 30 ){
			escreva("O valor da venda será de :",valor+(valor/100)*50," reais")
		}senao se(valor < 50 ){
			escreva("O valor da venda será de :",valor+(valor/100)*40," reais")
		}senao
		escreva("O valor da venda será de :",valor+(valor/100)*30," reais")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
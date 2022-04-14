programa
{
	
	funcao inicio()
	{
		inteiro nmr, valor = 60, sorteio, tst
		
		escreva("Escolha a quantidade de números que deseja sortear, entre 6 e 15 : ")
		leia(nmr)

		para(inteiro x = 1 ; x <= nmr ; x++){
			sorteio = sorteia(1,60)
			escreva("\nOs números para o seu jogo, são : ",sorteio)
		}
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 251; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro soma

		escreva("Preencha a matriz, em seguida será calculado a soma da diagonal secundária.\n")

		para(inteiro l = 0; l < 3; l++){
			para(inteiro c = 0; c < 3; c++){
				escreva("Digite um número : ")
				leia(matriz[l][c])
			}
		}
		soma = matriz[0][2] + matriz[1][1] + matriz[2][0]
		escreva("SOMA DA DIAGONAL SECUNDÁRIA : ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 162; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
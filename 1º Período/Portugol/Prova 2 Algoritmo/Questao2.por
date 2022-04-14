programa
{
	
	funcao inicio()
	{
		inteiro numero
		inteiro soma = 0
		
		escreva("Digite um número inteiro, positivo : ")
		leia(numero)

		escreva("A soma de todos os números de 1 até ",numero," é : \n")

		faca{
			se(numero >= 1)
			escreva(numero+" + ")
			numero--
			soma++
			soma = soma + numero
		}
		enquanto(numero > 0)
		
		
		escreva("= ",soma)

		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro num, n1, n2, n3

		escreva("Digite um número de três dígitos : ")
		leia(num)

		n1 = num % 10
		n2 = (num % 100) / 10
		n3 = num / 100

		escreva("A ordem invertida desses números, é : ",n1,n2,n3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
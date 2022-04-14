programa
{
	
	funcao inicio()
	{
		real salario, aumento
		
		escreva("A empresa dará aumento de 5% para salários abaixo de R$1.047,00.\n")
		
		escreva("Informe seu salário em reais: ")
		leia(salario)
          
          aumento = salario+(salario/100)*5
		
		se(salario >= 1047)
		escreva("Seu salário não atende aos requisitos para receber um aumento.")

		senao
		escreva("A partir de hoje você passará a receber: ",aumento," reais")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
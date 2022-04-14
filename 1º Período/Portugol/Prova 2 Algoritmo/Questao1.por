programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia palavra
		inteiro in
		caracter espelho

		escreva("Digite uma palavra para que seja mostrada sua versão espelhada : ")
		leia(palavra)

		in = Texto.numero_caracteres(palavra)
		escreva(palavra,"|")

		para(inteiro x = in-1 ; x >= 0 ; x--){
			espelho = Texto.obter_caracter(palavra, x)
			escreva(espelho)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
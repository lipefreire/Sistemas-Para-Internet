programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia frase
		inteiro qnt, palavras = 0, quantidade_de_palavras
		caracter spc

		escreva("Digite uma frase : ")
		leia(frase)

		qnt = Texto.numero_caracteres(frase)

		para(inteiro x = 0; x < qnt; x++){
			spc = Texto.obter_caracter(frase, x)
			se(spc == ' '){
				palavras++
			}
		}
		quantidade_de_palavras = palavras + 1
		escreva("Essa frase contém um total de ",quantidade_de_palavras," palavras\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
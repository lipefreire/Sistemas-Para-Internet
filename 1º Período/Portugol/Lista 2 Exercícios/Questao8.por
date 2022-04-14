programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		inteiro in
		cadeia frase1                   // sspc = Sem espaço.
		cadeia tira = " "
		cadeia adiciona = ""
		caracter invertido[300]
		cadeia invertido2 = ""

		escreva("OBS: Desconsidere letras maiúsculas")
		escreva("\nDigite uma frase : ")
		leia(frase1)
		
		cadeia f1sspc = Texto.substituir(frase1, tira, adiciona)

		in = Texto.numero_caracteres(f1sspc)
		
		para(inteiro x = in-1; x >= 0; x--){
			invertido[x] = Texto.obter_caracter(f1sspc, x)
			invertido2 = invertido2 + invertido[x]
		}
		se(f1sspc == invertido2){
			escreva("\nA frase digitada é um PALÍNDROMO.")
		}
		senao{
			escreva("\nA frase digitada não é um PALÍNDROMO.")
		}
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 666; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
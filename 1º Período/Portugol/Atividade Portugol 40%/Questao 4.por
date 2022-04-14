programa
{
	
	funcao inicio()
	{
		real gasolina, etanol, v

		escreva("Para saber qual o mais viável, digite primeiramente o preço da gasolina: \nR$ ")
		leia(gasolina)
		
		escreva("Agora digite o valor do etanol : \nR$ ")
		leia(etanol)

          v = gasolina / 100 * (70)
		
		se(etanol < v){
			escreva("O etanol é o combustível mais viável.")
		}senao{
			escreva("A gasolina é o combustível mais viável.")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro vet[10]

		escreva("Digite 10 números inteiros.\n")

		para(inteiro x = 0; x <= 9; x++){
			escreva("Digite um número : ")
			leia(vet[x])
		}
		limpa()
		escreva("Fim das leituras.\n")
		escreva("Listagem numérica apresentando índices e informação de números pares e ímpares : \n")

		para(inteiro x = 0; x <= 9; x++){
			escreva("\nÍndice : ",x)
			escreva("\nNúmero armazenado : ",vet[x])

			se(vet[x] %2 == 0){
				escreva("\nPar\n")
			}
			senao{
				escreva("\nÍmpar\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
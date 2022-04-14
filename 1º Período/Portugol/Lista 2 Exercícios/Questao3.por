programa
{
	
	funcao inicio()
	{
		inteiro nmr[10]
		inteiro valor = 1, dv = 0, primo = 0, cont

		escreva("Digite 10 números a seguir...\n")

		para(inteiro x = 0; x <= 9; x++){
			escreva("Digite um número : ")
			leia(nmr[x])
			primo = 0

		para(cont = 1; cont <= nmr[x]; cont++){
			se(nmr[x] % cont == 0){
				primo++
			}
		}
		se(primo == 2){
			escreva(nmr[x]," É um número PRIMO.\n\n")
		}
		senao{
			escreva("")
		}
		}
		escreva("Dentre os 10 números digitados, encontrei um total de ",primo," números primos.")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nmr, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
programa
{
	
	funcao inicio()
	{
		inteiro dado, vezes = 200, menor, maior
		inteiro n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0
		real porc1 = 0, porc2 = 0, porc3 = 0, porc4 = 0, porc5 = 0, porc6 = 0

		escreva("Ante de rodar os dados 200 vezes, escolha qual a menor e maior face que deseja contar. (de 1 até 6)")

		escreva("\nQual o valor da menor face do dado que deseja contar? : ")
		leia(menor)

		escreva("Qual o valor da maior face do dado que deseja contar? : ")
		leia(maior)

		para(inteiro x = 1 ; x <= vezes ; x++)
		{
			dado = sorteia(menor, maior)

			escreva("\nFace de Nº ",x," : ",dado) 

			se( dado == 1 )
			{
				n1++
			}
			se( dado == 2 )
			{
				n2++
			}
			se( dado == 3 )
			{
				n3++
			}
			se( dado == 4 )
			{
				n4++
			}
			se( dado == 5 )
			{
				n5++
			}
			se( dado == 6 )
			{
				n6++
			}
			porc1 = (n1 * 100) /200
			porc2 = (n2 * 100) /200
			porc3 = (n3 * 100) /200
			porc4 = (n4 * 100) /200
			porc5 = (n5 * 100) /200
			porc6 = (n6 * 100) /200 
		}

		escreva("\n\nO dado caiu na face de número 1 : ",n1," vezes.")
		escreva("\nO dado caiu na face de número 2 : ",n2," vezes.")
		escreva("\nO dado caiu na face de número 3 : ",n3," vezes.")
		escreva("\nO dado caiu na face de número 4 : ",n4," vezes.")
		escreva("\nO dado caiu na face de número 5 : ",n5," vezes.")
		escreva("\nO dado caiu na face de número 6 : ",n6," vezes.")

		escreva ("\n\nA porcentagem de vezes que caiu a face de número 1, foi de : ",porc1,"%")
		escreva ("\nA porcentagem de vezes que caiu a face de número 2, foi de : ",porc2,"%")
		escreva ("\nA porcentagem de vezes que caiu a face de número 3, foi de : ",porc3,"%")
		escreva ("\nA porcentagem de vezes que caiu a face de número 4, foi de : ",porc4,"%")
		escreva ("\nA porcentagem de vezes que caiu a face de número 5, foi de : ",porc5,"%")
		escreva ("\nA porcentagem de vezes que caiu a face de número 6, foi de : ",porc6,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
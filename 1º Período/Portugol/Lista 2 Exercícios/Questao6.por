programa
{
		
	funcao inicio()
	{
		caracter op
		inteiro matriz[8][8] = {
			 		{0,0,0,0,0,0,0,0},
					{0,0,1,0,0,1,0,0},
					{0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0},
					{0,1,0,0,0,0,1,0},
					{0,0,1,0,0,1,0,0},
					{0,0,0,1,1,0,0,0},
					{0,0,0,0,0,0,0,0} 
				}
		inteiro matriz180[8][8] = {
					{0,0,0,0,0,0,0,0},
					{0,0,0,1,1,0,0,0},
					{0,0,1,0,0,1,0,0},
					{0,1,0,0,0,0,1,0},
					{0,1,0,0,0,0,1,0},
					{0,0,1,0,0,1,0,0},
					{0,0,1,0,0,1,0,0},
					{0,0,0,0,0,0,0,0} 
		}
		inteiro matriz90[8][8] = {
					{0,0,0,0,0,0,0,0},
					{0,0,0,1,0,0,0,0},
					{0,0,1,0,0,0,1,0},
					{0,1,0,0,0,0,0,0},
					{0,1,0,0,0,0,0,0},
					{0,0,1,0,0,0,1,0},
					{0,0,0,1,0,0,0,0},
					{0,0,0,0,0,0,0,0} 
		}
		
		escreva("A matriz padrão é : \n")
		para(inteiro l = 0; l < 8; l++){
			para(inteiro c = 0; c < 8; c++){
				escreva(matriz[l][c])	 		
			}
		}
			escreva("\n\nEscola em quantos graus você quer girar a matriz : ")
			escreva("\nDigite 'A' caso queira girar em 90 Graus.")
			escreva("\nDigite 'B' caso queira girar em 180 Graus.")
			escreva("\nEscolha uma opção : ")
			leia(op)
			
			escolha(op){
				caso 'A': escreva("\nA matriz com um giro de 90 graus : ")
				para(inteiro l = 0; l < 8; l++){
					para(inteiro c = 0; c < 8; c++){
						escreva(matriz90[l][c])
					}
				}
				pare
				caso 'B': escreva("\nA matriz com um giro de 180 graus : ")
				para(inteiro l = 0; l < 8; l++){
					para(inteiro c = 0; c < 8; c++){
						escreva(matriz180[l][c])
					}
				}
				caso contrario: escreva("\nDigite uma opção válida.")
			}
	}
			
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
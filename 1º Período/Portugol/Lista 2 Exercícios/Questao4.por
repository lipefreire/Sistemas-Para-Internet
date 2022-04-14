programa
{
	
	funcao inicio()
	{
		inteiro mat[4][3]
		inteiro sm0, sm1, sm2, sm3

		escreva("Forme a matriz para descobrir qual a menor somatória.")
		escreva("\nA cada 3 números digitados a seguir, forma uma linha da matriz.\n\n")
		
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 3; c++){
				escreva("Digite um número : ")
				leia(mat[l][c])
			}
		}
		
		sm0 = (mat[0][0] + mat[0][1]) + mat[0][2]
		sm1 = (mat[1][0] + mat[1][1]) + mat[1][2]
		sm2 = (mat[2][0] + mat[2][1]) + mat[2][2]
		sm3 = (mat[3][0] + mat[3][1]) + mat[3][2]

		se((sm0 < sm1) e (sm0 < sm2) e (sm0 < sm3)){
			escreva("\nA PRIMEIRA linha da matriz é a com menor somatório.")
			escreva("\nA soma é : ",sm0)
			}
			senao se((sm1 < sm0) e (sm1 < sm2) e (sm1 < sm3)){
				escreva("\nA SEGUNDA linha da matriz é a com menor somatório.")
				escreva("\nA soma é : ",sm1)
			}
			senao se((sm2 < sm0) e (sm2 < sm1) e (sm2 < sm3)){
				escreva("\nA TERCEIRA linha da matriz é a com menor somatório.")
				escreva("\nA soma é : ",sm2)
			}
			senao se((sm3 < sm0) e (sm3 < sm1) e (sm3 < sm2)){
				escreva("\nA QUARTA linha da matriz é a com menor somatório.")
				escreva("\nA soma é : ",sm3)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
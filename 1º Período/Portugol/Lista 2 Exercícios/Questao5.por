programa
{
	
	funcao inicio()
	{
		caracter mat[4][4]
		
		escreva("Complete a matriz, no final será apresentado os\n")
		escreva("caracteres do triangulo inferior direito da matriz.\n\n")
		
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 4; c++){
				
				escreva("Digite um caracter : ")
				leia(mat[l][c])
			}
		}
		escreva("\nOs caracteres presentes no triângulo inferior direito, são : \n",mat[0][3],", ",mat[1][2],", ",mat[1][3],", ")
		escreva(mat[2][1],", ",mat[2][2],", ",mat[2][3],", ",mat[3][0],", ",mat[3][1],", ",mat[3][2],", ",mat[3][3])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 11, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
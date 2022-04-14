programa
{
	
	funcao inicio()
	{
		cadeia nome[8]
		real nt1[8]
		real nt2[8]
		real med[8]
		inteiro sit[8]
		real media

		escreva("Digite os dados dos 8 alunos.\n")
		
		para(inteiro x = 0; x <= 7; x++){
			escreva("\nDigite o nome do aluno : ")
			leia(nome[x])

			escreva("Digite a primeira nota : ")
			leia(nt1[x])

			escreva("Digite a segunda nota : ")
			leia(nt2[x])
			
		}
		limpa()
		para(inteiro x = 0; x <= 7; x++){
			med[x] = (nt1[x] + nt2[x]) /2

				escreva("\n",nome[x])
				escreva("\nMédia do aluno : ",med[x])
				se(med[x] >= 7){
					escreva("\nSituação : Aprovado\n")
				}
				senao{
					escreva("\nSituação : Reprovado\n")
				}
		}
		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
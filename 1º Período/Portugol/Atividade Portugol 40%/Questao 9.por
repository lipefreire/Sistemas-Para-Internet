programa
{
	
	funcao inicio()
	{
		inteiro aln = 10
		inteiro apr = 0, rep = 0, rec = 0
		real n1 = 0 , n2 = 0 , media , mt = 0 , soma = 0

		para(inteiro x = 1 ; x <= aln ; x++)
		{
		escreva(x,"º Aluno -")
				escreva("\nDigite a primeira nota : ")
				leia(n1)

				escreva("Digite a segunda nota : ")
				leia(n2)

				media = (n1 + n2) / 2
				escreva("\nMédia aritmética : ",media)

				soma = soma + media


				se(media <= 3){
					rep++
					escreva("\nStatus do aluno : REPROVADO.\n\n")
		} senao se((media > 3) e (media < 7)){
			rec++
			escreva("\nStatus do aluno : RECUPERAÇÃO.\n\n")
		} senao se((media >= 7) e (media <= 10)){
			apr++
			escreva("\nStatus do aluno : APROVADO.\n\n")
		}
		
				}

				escreva("Quantidade de alunos aprovados : ",apr)
				escreva("\nQuantidade de alunos reprovados : ",rep)
				escreva("\nQuantidade de alunos em recuperação : ",rec)

				mt = soma /10

				escreva("\nA média da turma é : ",mt)1
			

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 944; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
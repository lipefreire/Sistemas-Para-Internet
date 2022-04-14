programa
{
	
	funcao inicio()
	{
		inteiro idade, opiniao =0, pessoas = 15, reg=0, bom = 0, otm = 0
		inteiro soma = 0
		inteiro media_idade

		escreva("Digite a idade e opinião de 15 pessoas sobre o filme")

		para(inteiro x = 1 ; x <= pessoas ; x++){
			escreva("\nDigite a idade da ",x,"ª Pessoa : ")
			leia(idade)
			escreva("Digite a opiniao da ",x,"ª Pessoa (entre 1 e 3) : ")
			leia(opiniao)

			se(opiniao == 1){
				reg++
			}
			se(opiniao == 2){
				bom++
			}
			se(opiniao == 3){
				otm++
				soma = soma + idade
			}

		}
		media_idade = soma / 15
		
		escreva("\nA média das idades das pessoas que responderam ótimo : ",media_idade)
		escreva("\nA quantidade de pessoas que responderam regular : ",reg)
		escreva("\nA percentagem de pessoas que responderam bom : ",bom,"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
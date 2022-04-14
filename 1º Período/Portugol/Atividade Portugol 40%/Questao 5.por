programa
{
	
	funcao inicio()
	{
		inteiro n1, n2, n3, m
		
		escreva("Digite o primeiro número : ")
		leia(n1)

		escreva("Digite o segundo número : ")
		leia(n2)

		escreva("Digite o terceiro número : ")
		leia(n3)

     faca{

	se(n1 < n3){
	m = n1
	n1 = n3
	n3 = m
	}

	se(n1 < n2){
	m = n1
	n1 = n2
	n2 = m
	}

	se(n2 < n3){
	m = n2
	n2 = n3
	n3 = m
	}

}      enquanto(n1 < n3 ou n1 < n2 ou n2 < n3)
       escreva("A ordem decrescente é : ",n1," ",n2," ",n3)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
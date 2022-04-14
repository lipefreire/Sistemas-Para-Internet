programa
{
	
	funcao inicio()
	{
		real fah, seg, ter, qua, qui, sex, sab, dom
		real fseg, fter, fqua, fqui, fsex, fsab, fdom
		
		escreva("Escreva a temperatura da semana completa em graus Celsius\n")

		escreva("Domingo : ")
		leia(dom)

		escreva("Segunda : ")
		leia(seg)

		escreva("Terça : ")
		leia(ter)

		escreva("Quarta : ")
		leia(qua)

		escreva("Quinta : ")
		leia(qui)

		escreva("Sexta : ")
		leia(sex)

		escreva("Sábado : ")
		leia(sab)
		
		fdom = (dom * 1.8) + 32
		fseg = (seg * 1.8) + 32
		fter = (ter * 1.8) + 32
		fqua = (qua * 1.8) + 32
		fqui = (qui * 1.8) + 32
		fsex = (sex * 1.8) + 32
		fsab = (sab * 1.8) + 32


		escreva("Temperatura completa da semana em graus Fahrenheit.\n")
		escreva("\nDomingo : ",fdom)
		escreva("\nSegunda : ",fseg)
		escreva("\nTerça : ",fter)
		escreva("\nQuarta : ",fqua)
		escreva("\nQuinta : ",fqui)
		escreva("\nSexta : ",fsex)
		escreva("\nSábado : ",fsab)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 646; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
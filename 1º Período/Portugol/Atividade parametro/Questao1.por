programa
{
	inclua biblioteca Texto --> t
	
	funcao nome1() {
		escreva("Digite um nome para que seja escrito de trás para frente : ")
	}
	funcao inicio()
	{
		cadeia nome 
		inteiro in
		caracter res

		nome1()
		leia(nome)

		in = t.numero_caracteres(nome)

		para(inteiro x = in-1 ; x >= 0 ; x--){
			res = t.obter_caracter(nome, x)
			escreva("",res)

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 185; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
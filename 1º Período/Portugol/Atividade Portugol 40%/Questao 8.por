programa
{
	
	funcao inteiro pm(inteiro x){
		inteiro y, ctd = 0

		para(y = 1;y <= x; y++){
			se(x % y == 0)
			ctd ++
		}
		se(ctd == 2)
		 retorne 1
		senao
		 retorne 0
	}
	
	funcao inicio(){
	
	inteiro y 

	escreva("Os números primos de 1 a 500, são : ")

	para(y = 1; y <= 500; y++){
		se(pm(y) == 1)
		escreva(y,", ")
	}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
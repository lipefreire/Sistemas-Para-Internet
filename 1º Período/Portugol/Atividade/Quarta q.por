programa
{
	
	funcao inicio()
	{
		real n1,n2,res
		caracter op
		

		escreva("Escolha um operador: (+, -, *, /): ")
		leia(op)

		escolha(op){
			caso '+': escreva("Digite um número: ") leia(n1)
		             escreva("Digite outro número: ") leia(n2)
		             res = n1+n2
		             escreva("Soma dos números: ",res)
		     pare        
		     caso '-': escreva("Digite um número: ") leia(n1)
		             escreva("Digite outro número: ") leia(n2)
		             res = n1-n2
		             escreva("Subtração dos números: ",res)
		     pare        
		     caso '*': escreva("Digite um número: ") leia(n1)
		             escreva("Digite outro número: ") leia(n2)  
		             res = n1*n2
		             escreva("Multiplicação dos números: ",res)
		     pare                     
		     caso '/': escreva("Digite um número: ") leia(n1)
		             escreva("Digite outro número: ") leia(n2)
		             res = n1/n2
		             escreva("Divisão dos números: ",res)
		     pare        
		     caso contrario: escreva("Digite um operador válido.")
		}
		

		
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
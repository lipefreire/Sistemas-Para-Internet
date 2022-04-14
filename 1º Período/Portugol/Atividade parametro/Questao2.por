programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia frase
		inteiro qnt, vogais, qnt_vogais, vg = 0
		caracter ab

		mensagem()
		leia(frase)

		qnt = Texto.numero_caracteres(frase)

		para(inteiro x = 0; x<qnt; x++){
			ab = Texto.obter_caracter(frase, x)
			se(ab == 'a'){
				vg++
			}senao se(ab == 'e'){
				vg++
			}senao se(ab == 'i'){
				vg++
			}senao se(ab == 'o'){
				vg++
			}senao se(ab == 'u'){
				vg++
			}
		}qnt_vogais = vg
			escreva("Existem ",qnt_vogais," vogais nessa frase.")
		
	}
	funcao mensagem() {
		escreva("Digite uma frase : ")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
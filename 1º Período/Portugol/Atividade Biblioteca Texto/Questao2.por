programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia frase
		inteiro qnt, vogais, qnt_vogais, vg1 = 0, vg2 = 0, vg3 = 0, vg4 = 0, vg5 = 0
		caracter ab

		escreva("Digite uma frase: ")
		leia(frase)

		qnt = Texto.numero_caracteres(frase)

		vogais = 0
		qnt_vogais = 0

		para(inteiro x = 0; x<qnt; x++){
			ab = Texto.obter_caracter(frase, x)
			se(ab == 'a'){
				vg5++
			}senao se(ab == 'e'){
				vg1++
			}senao se(ab == 'i'){
				vg2++
			}senao se(ab == 'o'){
				vg3++
			}senao se(ab == 'u'){
				vg4++
			}
		}qnt_vogais = vg1 + vg2 + vg3 + vg4 + vg5
			escreva("Existem ",qnt_vogais," vogais nessa frase.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 631; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
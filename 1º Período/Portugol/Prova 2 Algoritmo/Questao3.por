programa
{
	inclua biblioteca Texto
	
	funcao inicio()
	{
		cadeia frase   // professor, essa foi a única forma que encontrei de trocar uma letra maiúscula por minúscula e vice versa
		inteiro in     // pode existir forma mais fácil e simples, porém foi a única que consegui.
		caracter ident

		escreva("OBS: Textos em caixa alta serão transformados em caixa baixa e vice-versa.")
		escreva("\nDigite uma frase : ")
		leia(frase)
		escreva("Texto alterado : ")
		
		in = Texto.numero_caracteres(frase)

		para(inteiro x = 0; x < in; x++){
			ident = Texto.obter_caracter(frase, x)

			se(ident == 'a'){
				ident = 'A'
			}
			senao se(ident == 'A'){
				ident = 'a'
			}
			se(ident == 'b'){
				ident = 'B'
			}
			senao se(ident == 'B'){
				ident = 'b'
			}
			se(ident == 'c'){
				ident = 'C'
			}
			senao se(ident == 'C'){
				ident = 'c'
			}
			se(ident == 'd'){
				ident = 'D'
			}
			senao se(ident == 'D'){
				ident = 'd'
			}
			se(ident == 'e'){
				ident = 'E'
			}
			senao se(ident == 'E'){
				ident = 'e'
			}
			se(ident == 'f'){
				ident = 'F'
			}
			senao se(ident == 'F'){
				ident = 'f'
			}
			se(ident == 'g'){
				ident = 'G'
			}
			senao se(ident == 'G'){
				ident = 'g'
			}
			se(ident == 'h'){
				ident = 'H'
			}
			senao se(ident == 'H'){
				ident = 'h'
			}
			se(ident == 'i'){
				ident = 'I'
			}
			senao se(ident == 'I'){
				ident = 'i'
			}
			se(ident == 'J'){
				ident = 'j'
			}
			senao se(ident == 'j'){
				ident = 'J'
			}
			se(ident == 'k'){
				ident = 'K'
			}
			senao se(ident == 'K'){
				ident = 'k'
			}
			se(ident == 'L'){
				ident = 'l'
			}
			senao se(ident == 'l'){
				ident = 'L'
			}
			se(ident == 'M'){
				ident = 'm'
			}
			senao se(ident == 'm'){
				ident = 'M'
			}
			se(ident == 'N'){
				ident = 'n'
			}
			senao se(ident == 'n'){
				ident = 'N'
			}
			se(ident == 'O'){
				ident = 'o'
			}
			senao se(ident == 'o'){
				ident = 'O'
			}
			se(ident == 'P'){
				ident = 'p'
			}
			senao se(ident == 'p'){
				ident = 'P'
			}
			se(ident == 'Q'){
				ident = 'q'
			}
			senao se(ident == 'q'){
				ident = 'Q'
			}
			se(ident == 'R'){
				ident = 'r'
			}
			senao se(ident == 'r'){
				ident = 'R'
			}
			se(ident == 'S'){
				ident = 's'
			}
			senao se(ident == 's'){
				ident = 'S'
			}
			se(ident == 'T'){
				ident = 't'
			}
			senao se(ident == 't'){
				ident = 'T'
			}
			se(ident == 'U'){
				ident = 'u'
			}
			senao se(ident == 'u'){
				ident = 'U'
			}
			se(ident == 'V'){
				ident = 'v'
			}
			senao se(ident == 'v'){
				ident = 'V'
			}
			se(ident == 'W'){
				ident = 'w'
			}
			senao se(ident == 'w'){
				ident = 'W'
			}
			se(ident == 'X'){
				ident = 'x'
			}
			senao se(ident == 'x'){
				ident = 'X'
			}
			se(ident == 'Y'){
				ident = 'y'
			}
			senao se(ident == 'y'){
				ident = 'Y'
			}
			se(ident == 'Z'){
				ident = 'z'
			}
			senao se(ident == 'z'){
				ident = 'Z'
			}
			
			escreva(ident)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
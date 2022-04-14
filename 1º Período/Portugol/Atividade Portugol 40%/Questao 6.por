programa
{
	
	funcao inicio()
	{
		real peso, altura, imc

		escreva("Escreva sua altura em metros : ")
		leia(altura)

		escreva("Agora escreva seu peso em quilogramas : ")
		leia(peso)

		imc = peso / (altura * altura)

		escreva("\nSeu IMC (índice de massa corporal) é : ",+ imc,".")

		se(imc < 20){
			escreva(" Você está abaixo do peso normal.")
		} senao se((imc >= 20) e (imc <= 25)){
			escreva(" Está tudo ok, você está no peso normal.")
		} senao se((imc > 25) e (imc <= 30)){
			escreva(" Atenção, você está acima do peso normal.")
		} senao se(imc > 30){
			escreva(" Cuidado, seu estado é de obesidade.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */

public class App {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		//ADICIONANDO UM VALOR A STRING QUE FOR NULA.
		vetor.adiciona("SALGUEIRO");
		vetor.adiciona("CABROB�");
		vetor.adiciona("SERRITA");
		
		System.out.println("Inserinto novo elemento...");
		System.out.println("Tamanho: " + vetor.tamanho());
		
		System.out.println("\nTestando o to string... \n" + vetor.imprime() + "\n");
		
		System.out.println("Buscando valor da posi��o[2]: " + vetor.busca(2));
		System.out.println("Buscando valor da posi��o[0]: " + vetor.busca(0) + "\n");
		
		
		System.out.println("O valor PETROLINA est� no vetor? " + vetor.verifica("PETROLINA"));
		
		//OUTRA FORMA DE VERIFICAR
		if(vetor.verifica("CABROB�")) {
			System.out.println("Valor encontrado!");
		}else {
			System.out.println("Valor n�o encontrado!");
		}
		
		System.out.println("Qual a posi��o do elemento 'SERRITA'?\nPosi��o: " + vetor.verificaPosicao("SERRITA"));
		System.out.println("");
		
		//ADICIONANDO UM ELEMENTO EM UMA POSI��O
		vetor.adicionaPosicao(1, "RECIFE");
		System.out.println(vetor.imprime());
		
		//REMOVENDO UM ELEMENTO EM UMA POSI��O
		vetor.removerElemento(1);
		System.out.println(vetor.imprime());
		
		//REMOVENDO UM ELEMENTO A PARTIR DO SEU VALOR [1� OP��O]
		int pos = vetor.verificaPosicao("RECIFE");
		if(pos > -1) {
			vetor.removerElemento(pos);
		}else {
			System.out.println("Valor inexistente ou posi��o inv�lida.");
		}
		System.out.println(vetor.imprime());
		
		//REMOVENDO UM ELEMENTO A PARTIR DO SEU VALOR [2� OP��O]
		
		System.out.println("\n========= VETOR 2 ========\n");
		
		Vetor vetor2 = new Vetor(5);
		System.out.println("Tamanho: " + vetor2.tamanho());
		System.out.println("Inserindo novo elemento...");
		
		
		vetor2.adicionaNovo("SUCO");
		vetor2.adicionaNovo("AGUA");
		vetor2.adicionaNovo("REFRIGERANTE");
		vetor2.adicionaNovo("HAMBURGUER");
		vetor2.adicionaNovo("CACHORRO QUENTE");
		vetor2.adicionaNovo("PASTEL");
		
		System.out.println("Vetor 2: " + vetor2.imprime());
		System.out.println("Tamanho atualizado: " + vetor2.tamanho());
		System.out.println("=============================");
	
	}

}

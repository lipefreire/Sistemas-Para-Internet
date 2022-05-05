
public class App {
	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		Vetor vetor2 = new Vetor(5);
		
		vetor.adiciona("Salgueiro");
		vetor.adiciona("Recife");
		vetor.adiciona("Petrolina");
		vetor.adiciona("Cabrob�");
		vetor.adiciona("Fortaleza");
	
		System.out.println("Imprimindo o vetor: " + vetor.imprime());
		
		//1 - LIMPANDO A LISTA.
		System.out.println("QUEST�O 1 -\nLimpando a lista.");
		vetor.limparLista();
		System.out.println("Lista atualizada: " + vetor.imprime());
		System.out.println("\n");
		
		
		//ADICIONANDO ELEMENTOS NO VETOR NOVAMENTE PARA QUE A QUEST�O 2 E 3 FUNCIONE.
		vetor2.adicionaPosicao((0), "Salgueiro");
		vetor2.adicionaPosicao((1), "Petrolina");
		vetor2.adicionaPosicao((2), "Cabrob�");
		vetor2.adicionaPosicao((3), "Fortaleza");
		vetor2.adicionaPosicao((4), "Recife");
		
		System.out.println("QUEST�O 2 -");
		System.out.println(vetor2.imprime());
		
		//2 - PROCURAR �NDICE
		vetor2.procurarIndice("Fortaleza");
		
		//3 - REMOVER ELEMENTOS
		System.out.println("\nQUEST�O 3 -");
		System.out.println("REMOVENDO ELEMENTO DO VETOR...");
		
		vetor2.removerElemento("Petrolina");
		
		System.out.println("Vetor atualizado: " + vetor2.imprime());

	}
}

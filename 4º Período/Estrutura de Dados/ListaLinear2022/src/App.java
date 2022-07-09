
public class App {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		Vetor vetor2 = new Vetor(5);
		System.out.println("Tamanho: " + vetor.tamanho());
		
		//ADICIONANDO UM VALOR A STRING QUE FOR NULA.
		vetor.adiciona("SALGUEIRO");
		vetor.adiciona("CABROBÓ");
		vetor.adiciona("SERRITA");
		
		System.out.println("Inserinto novo elemento...");
		System.out.println("Tamanho: " + vetor.tamanho());
		
		System.out.println("\nTestando o to string... \n" + vetor.imprime() + "\n");
		
		System.out.println("Buscando valor da posição[2]: " + vetor.busca(2));
		System.out.println("Buscando valor da posição[0]: " + vetor.busca(0) + "\n");
		
		
		System.out.println("O valor PETROLINA está no vetor? " + vetor.verifica("PETROLINA"));
		
		//OUTRA FORMA DE VERIFICAR
		if(vetor.verifica("CABROBÓ")) {
			System.out.println("Valor encontrado!");
		}else {
			System.out.println("Valor não encontrado!");
		}
	}

}


public class App {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		Vetor vetor2 = new Vetor(5);
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
	}

}

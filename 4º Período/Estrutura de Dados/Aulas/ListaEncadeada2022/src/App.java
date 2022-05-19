
public class App {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//ADICIONANDO ELEMENTOS NO INICIO DA LISTA.
		lista.adicionaNoInicio("SALGUEIRO");
		System.out.println(lista);
		lista.adicionaNoInicio("CABROB�");
		System.out.println(lista);
		
		//ADICIONANDO ELEMENTOS NO FIM DA LISTA.
		lista.adicionaNoFinal("PETROLINA");
		System.out.println(lista);
		
		//ADICIONANDO UM VALOR EM UMA DETERMINANDA POSI��O
		lista.adiciona(2, "RECIFE");
		System.out.println(lista);
		
		//RETORNA O ELEMENTO DE UMA DETERMINADA POSI��O
		System.out.println("Verificando a posi��o 1: " + lista.pega(1));
		
		//REMOVENDO UM ELEMENTO DO INICIO DA LISTA
		System.out.println("Lista atual antes da remo��o: " + lista);
		lista.removeDoInicio();
		System.out.println(lista);
		
		//REMOVENDO UM ELEMENTO DO FINAL DA LISTA
		lista.removeDoFinal();
		System.out.println(lista);
	}
}

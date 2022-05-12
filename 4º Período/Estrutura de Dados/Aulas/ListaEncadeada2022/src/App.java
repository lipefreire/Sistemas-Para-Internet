
public class App {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		//ADICIONANDO ELEMENTOS NO INICIO DA LISTA.
		lista.adicionaNoInicio("SALGUEIRO");
		System.out.println(lista);
		lista.adicionaNoInicio("CABROBÓ");
		System.out.println(lista);
		
		//ADICIONANDO ELEMENTOS NO FIM DA LISTA.
		lista.adicionaNoFinal("PETROLINA");
		System.out.println(lista);
		
		
		
	}
}

import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		
		// 1ª QUESTÃO
		lista.add("Alfredo");
		lista.add("José");
		lista.add("Zezinho");
		lista.add("Eduardo");
		lista.add("Rodrigo");
		
		System.out.println(lista);
		
		// 2ª QUESTÃO
		//CONTAINS RETORNA TRUE OU FALSE
		System.out.println("Elemento existente na lista: " + lista.contains("Eduardo"));
		
		// 3ª QUESTÃO
		System.out.println(lista.get(1));
		
		// 4ª QUESTÃO
		// INSERÇÃO NO INICIO DA LISTA
		lista.addFirst("Felipe");
		// REMOÇÃO NO FINAL DA LISTA
		lista.removeLast();
		System.out.println(lista);
		
		// 5ª QUESTÃO
		System.out.println("Primeiro elemento: " + lista.getFirst() + " || Ultimo elemento: " + lista.getLast());
		
		// 6ª QUESTÃO
		lista.remove(3);
		System.out.println(lista);
		
	}

}

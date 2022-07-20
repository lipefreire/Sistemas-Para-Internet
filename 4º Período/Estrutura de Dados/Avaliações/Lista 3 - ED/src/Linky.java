import java.util.LinkedList;

public class Linky {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();
		
		// 1� QUEST�O
		lista.add("Alfredo");
		lista.add("Jos�");
		lista.add("Zezinho");
		lista.add("Eduardo");
		lista.add("Rodrigo");
		
		System.out.println(lista);
		
		// 2� QUEST�O
		//CONTAINS RETORNA TRUE OU FALSE
		System.out.println("Elemento existente na lista: " + lista.contains("Eduardo"));
		
		// 3� QUEST�O
		System.out.println(lista.get(1));
		
		// 4� QUEST�O
		// INSER��O NO INICIO DA LISTA
		lista.addFirst("Felipe");
		// REMO��O NO FINAL DA LISTA
		lista.removeLast();
		System.out.println(lista);
		
		// 5� QUEST�O
		System.out.println("Primeiro elemento: " + lista.getFirst() + " || Ultimo elemento: " + lista.getLast());
		
		// 6� QUEST�O
		lista.remove(3);
		System.out.println(lista);
		
	}

}

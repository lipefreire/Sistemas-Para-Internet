
public class App {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(5);
		
		pilha.push(10);
		pilha.push(20);
		System.out.println("Topo da pilha: " + pilha.top());
		
		System.out.println("------------------------------");
		pilha.push(500);
		System.out.println("Topo da pilha: " + pilha.top());
		System.out.println(pilha);
		
		System.out.println("\nREMOVENDO...");
		pilha.pop();
		System.out.println("Topo da pilha: " + pilha.top());
		
		System.out.println("------------------------------");
		System.out.println("A pilha está vazia: " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " + pilha.size());
		
	}

}

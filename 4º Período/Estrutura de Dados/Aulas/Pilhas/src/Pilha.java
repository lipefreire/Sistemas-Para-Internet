
public class Pilha {
	private Object elementos[];
	private int topo;
	
	public Pilha(int capacidade) {
		this.topo = -1;
		this.elementos = new Object[capacidade];
	}
	
	// INCREMENTA UM VALOR NA PILHA
	public boolean push(Object elemento) {
		if(this.topo < this.elementos.length - 1) {
			this.topo++;
			this.elementos[topo] = elemento;
			return true;
		}
		return false;
	}
	
	// VERIFICA SE A PILHA É VAZIA
	public boolean isEmpty() {
		return topo < 0;
	}
	
	// VERIFICA O TAMANHO DA PILHA
	public int size() {
		if(this.isEmpty()) {
			return 0;
		}
		else {
			return this.topo + 1;
		}
	}
	
	//REMOVE UM ELEMENTO DA PILHA
	public Object pop() {
		if(this.isEmpty()) {
			return null;
		}
		else {
			return this.elementos[this.topo--];
		}
	}
	
	// RETORNA O ULTIMO ELEMENTO DA PILHA
	public Object top() {
		if(this.isEmpty()) {
			return null;
		}
		else { 
			return this.elementos[this.topo];
		}
	}
}

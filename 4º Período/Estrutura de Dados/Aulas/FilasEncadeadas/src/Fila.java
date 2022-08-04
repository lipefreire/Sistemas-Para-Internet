public class Fila {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	public Fila() {
		this.inicio = null;
		this.fim = null;
		this.totalDeElementos = 0;
	}
	
	// ENFILEIRAR - ADICIONAR
	public void enqueue(Object elemento) {
		No novo = new No(elemento);
		if(this.isEmpty()) {
			this.inicio = novo;
		}
		else {
			this.fim.setProximo(novo);
		}
		this.fim = novo;
		this.totalDeElementos++;
	}
	
	// DESENFILEIRAR - REMOVER
	public void dequeue() {
		if(!isEmpty()) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
			if(totalDeElementos == 0) this.fim = null;
		}
		
	}
	
	// TAMANHO DA FILA
	public int size() {
		return this.totalDeElementos;
	}
	
	// PRIMEIRO DA FILA
	public Object front() {
		return this.inicio.getElemento();
	}
	
	public boolean isEmpty() {
		return this.totalDeElementos == 0;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getTotalDeElementos() {
		return totalDeElementos;
	}

	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	

}

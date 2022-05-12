
public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	//PARA ADICIONAR ELEMENTOS NO INICIO DA LISTA.
	public void adicionaNoInicio(Object elemento) {
		No novo = new No(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos == 0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}
	
	//PARA ADICIONAR ELEMENTOS NO FIM DA LISTA.
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoInicio(elemento);
		}
		else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			this.fim = novo;
			this.totalDeElementos ++;
		}
	}

	/*@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";
	}
	*/
	
	@Override
	public String toString() {
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = this.inicio;
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

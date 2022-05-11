
public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	public void adicionaNoInicio(Object elemento) {
		No novo = new No(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos == 0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";
	}
	
	
}

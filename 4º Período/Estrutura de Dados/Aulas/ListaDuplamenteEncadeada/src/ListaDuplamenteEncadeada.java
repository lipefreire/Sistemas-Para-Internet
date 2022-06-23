
public class ListaDuplamenteEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			No novo = new No(elemento);
			this.fim = novo;
		}
		else {
			No novo = new No(elemento, this.inicio);
			this.inicio.setAnterior(novo);
		}
		this.totalDeElementos++;
	}
	
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		}
		else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			novo.setAnterior(this.fim);
			this.fim = novo;
			this.totalDeElementos++;
		}
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

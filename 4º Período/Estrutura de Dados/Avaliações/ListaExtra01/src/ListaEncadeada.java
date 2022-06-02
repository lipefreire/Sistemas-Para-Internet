
public class ListaEncadeada {
	
	//1ª)QUESTÃO
	
	
	//2ª) QUESTÃO
	public void removerRepetidos() {//
		for(int i = 0; i<this.totalDeElementos-1;i++) {
			if(this.getElemento().equals(this.elemento.getElemento())) {
				No atual = this.pegaNo(i);
				No proximo = atual.getProximo();
				atual.setProximo(proximo);
				this.totalDeElementos--;
			}
		}
	}
	
	//APAGAR
	public String verificaOrdem(ListaEncadeada Lista) {
		No atual = this.inicio;
		
		for(int i = 0; i < this.totalDeElementos - 1; i++) {
			No proximo = atual.getProximo();
			if((int) atual.getElemento() > (int) proximo.getElemento()) {
				return "Lista NÃO Ordenada!";
			}
			atual = atual.getProximo();
		}
		return "Lista Ordenada!";
	}
	
	//APAGAR
	public String verificaListas(ListaEncadeada x, ListaEncadeada y) {
		if(x.totalDeElementos != y.totalDeElementos) return "Listas Diferentes";
		
		No atualx = x.inicio;
		No atualy = y.inicio;
		
		for(int i = 0; i < x.totalDeElementos - 1; i++) {
			if(!(atualx.getElemento().equals(atualy.getElemento()))) {
			}
			atualx = atualx.getProximo();
			atualy = atualy.getProximo();
		}
		return "Listas Iguais";
	}
	
	//3ª) QUESTÃO
	public void transfereValores(Object[] elementos) {
		for(int i = 0; i < elementos.length; i++) {
			this.adicionaNoFinal(elementos[i]);
		}
		System.out.println("\nLista após a inserção: " + this.toString());
	}
	
	//4ª) QUESTÃO
	public void copiaLista(ListaEncadeada x) {
		ListaEncadeada y = new ListaEncadeada();
		
		while(x.totalDeElementos > 0) {
			No atual = x.inicio;
			No maior = atual;
			int pos = 0;
			for(int i = 0; i < x.totalDeElementos; i++) {
			if((int) atual.getElemento() > (int) maior.getElemento()) {
				maior = atual;
				pos = i;
			}
			atual = atual.getProximo();
		}
		y.adicionaNoFinal(maior);
		if(pos == 0) {
			x.removeDoInicio();
		}else {
			
		}
			No anteriorMaior = x.pegaNo(pos-1);
			anteriorMaior.setProximo(maior.getProximo());
			x.totalDeElementos--;
		}
		System.out.println("\n\nValores de X após a remoção: " + x.toString());
		System.out.println("Valores de Y: " + y);
	}
	
	//5ª) QUESTÃO
	public void removeAteX(ListaEncadeada lista, int x) {
		System.out.println("Lista antes da remoção: " + lista);
		No anteriorNovoInicio = lista.pegaNo(x);
		this.inicio = anteriorNovoInicio.getProximo();
		lista.totalDeElementos -= x + 1;
		System.out.println("Lista após a remoção: " + lista);
	}
	
	private No fim;
	private No inicio;
	private int totalDeElementos;
	
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
	
	public void adicionaNoInicio(Object elemento) {
		No novo = new No(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos==0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}
	
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos==0) {
			this.adicionaNoInicio(elemento);
		}else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			this.fim = novo;
			this.totalDeElementos++;
		}
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos==0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = this.inicio;
		for(int i=0; i<this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inálida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao==0) {
			this.adicionaNoInicio(elemento);
		}else if(posicao==this.totalDeElementos-1) {
			this.adicionaNoFinal(elemento);
		}else{
			No anterior = this.pegaNo(posicao-1);
			No novo = new No(elemento, anterior.getProximo());
			anterior.setProximo(novo);
			this.totalDeElementos++;
		}
	}
	
	public Object pega(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	
	public void removeDoInicio() {
		this.inicio = this.inicio.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos==0) {
			this.fim = null;
		}
	}
	
	public void removeDoFinal() {
		if(this.totalDeElementos==0) {
			System.out.println("Lista vazia! Impossível remover!");
		}else if(this.totalDeElementos==1){
			this.removeDoInicio();
		}else {		
			No anterior = this.pegaNo(this.totalDeElementos-2);
			anterior.setProximo(null);
			this.fim = anterior;
			this.totalDeElementos--;
		}
	}

	
	
}

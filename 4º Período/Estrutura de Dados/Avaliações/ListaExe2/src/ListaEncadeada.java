
public class ListaEncadeada {
	
	//1ª)QUESTÃO
	public void moveMenor() {
		No atual = this.inicio;
		No menor = this.inicio;
		
		int posMenor = 0;
		for(int i = 0; i < this.totalDeElementos - 1; i++) {
			if((int) atual.getElemento() < (int)menor.getElemento()) {
				menor = atual;
				posMenor = i;
			}
			atual = atual.getProximo();
		}
		System.out.println("O menor elemento da lista é: " + menor.getElemento());
		No anterior = this.pegaNo(posMenor - 1);
		anterior.setProximo(menor.getProximo());
		menor.setProximo(this.inicio);
		this.inicio = menor;
	}
	
	//2ª) QUESTÃO
	public void removeRepetidos() {
		No atual = this.inicio;
		int removidos = 0;
		ListaEncadeada removiveis = new ListaEncadeada();
		
		for(int i = 0; i < this.totalDeElementos; i++) {
			No atual2 = atual.getProximo();
			for(int j = i + 1; j < this.totalDeElementos - i; j++) {
				if(atual.getElemento().equals(atual2.getElemento()));{
					removiveis.adicionaNoInicio(j);
				}
				atual2 = atual2.getProximo();
			}
			atual = atual.getProximo();
		}
		System.out.println(removiveis);
		No atualRemoviveis = removiveis.inicio;
		for(int i = 0; i < this.totalDeElementos; i++) {
			removiveis.remove(i);
			atualRemoviveis = atualRemoviveis.getProximo();
		}
		
	}
	
	//3ª) QUESTÃO
	public void trocaValores(String valor1, String valor2) {
		No atual = this.inicio;
		int pos1 = 0, pos2 = 0;
		for(int i = 0; i < this.totalDeElementos; i++) {
			if(atual.getElemento().equals(valor1)) pos1 = i;
			if(atual.getElemento().equals(valor2)) pos2 = i;
			atual = atual.getProximo();
		}
		System.out.println("Posição 1: " + pos1 + "Posição 2: " + pos2);
		No anteriorPos1 = this.pegaNo(pos1 - 1);
		System.out.println(anteriorPos1.getElemento());
		No NoPos1 = anteriorPos1.getProximo();
		System.out.println(NoPos2.getelemento());
		
		No anteriorPos2 = this.pegaNo(pos2 - 1);
		No NoPos2 = anteriorPos2.getProximo();
		
		anteriorPos1.setProximo(NoPos2);
		NoPos2.setProximo(NoPos1.getProximo());
		
		anteriorPos2.setProximo(NoPos1);
		NoPos1.setProximo(NoPos2.getProximo());
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

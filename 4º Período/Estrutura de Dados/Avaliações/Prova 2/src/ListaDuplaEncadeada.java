public class ListaDuplaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
//	PRIMEIRA QUESTAO
	public void encontraNesimo(int num) {
		
	}
	
//	SEGUNDA QUEST�O
	public void divideLista(int num) {
		No atual = this.getInicio();
		if(num == 0) {
			throw new IllegalArgumentException("Digite um valor v�lido (Maior ou igual a 1)");
		}
		ListaDuplaEncadeada dividido = new ListaDuplaEncadeada();
		int total = (this.getTotalDeElementos() / num);
		
		for(int x = 0; x < num; x++) {
			ListaDuplaEncadeada lista2 = new ListaDuplaEncadeada();
			
			for(int y = 0; y < total; y++) {
				dividido.adicionaNoFinal(atual.getElemento());
				//ANTIGO ATUAL FOI EXCLU�DO
				atual = atual.getProximo();
			}
			dividido.adicionaNoFinal(lista2);
		}
		System.out.println(dividido);
	}
	
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o In�lida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void adicionaNoInicio(Object elemento) {
        if(this.totalDeElementos == 0) {
            No novo = new No(elemento);
            this.inicio = novo;
            this.fim = novo;            
        }
        else {
            No novo = new No(elemento, this.inicio);
            this.inicio.setAnterior(novo);
            this.inicio = novo;
        }
        this.totalDeElementos++;
    }
   
    public void adicionaNoFinal(Object elemento) {
        if(this.totalDeElementos == 0) {
            this.adicionaNoInicio(elemento);
        }
        else {
            No novo = new No(elemento);
            this.fim.setProximo(novo);
            novo.setAnterior(this.fim);
            this.fim = novo;
            this.totalDeElementos++;
        }
    }
    
    public void adiciona(int posicao, Object elemento) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.adicionaNoInicio(elemento);
			}else {
				No anterior = this.pegaNo(posicao-1);
				No proximo = anterior.getProximo();
				No novo = new No(elemento, proximo);
				anterior.setProximo(novo);
				proximo.setAnterior(novo);
				novo.setAnterior(anterior);
								
				this.totalDeElementos++;
				
			}
		}else if(posicao == this.totalDeElementos){
			this.adicionaNoFinal(elemento);
		}else{
			System.out.println("Posi��o inv�lida!");
		}	
    }
    
    public void removeDoInicio() {    	
    	if(this.totalDeElementos > 1) {
    		No novoInicio = this.inicio.getProximo();
    		novoInicio.setAnterior(null);
    		this.inicio = novoInicio;
    	}else {
    		this.fim = null;
    		this.inicio = null;
    	}
    	this.totalDeElementos--;    	  	
    }
    
    public void removeDoFinal() {
    	if(this.totalDeElementos > 1) {
	    	No NovoFim = this.fim.getAnterior();
	    	NovoFim.setProximo(null);
	    	this.fim = this.fim.getAnterior();
	    	this.totalDeElementos--;  
    	}
    	else {
    		this.removeDoInicio();
    	}
    }
    
    public void remove(int posicao) {
    	if(this.posicaoValida(posicao)) {
    		if(posicao == 0) {
    			this.removeDoInicio();
    		}else if(posicao == this.totalDeElementos-1) {
    			this.removeDoFinal();
    		}else {    		
	    		No no = this.pegaNo(posicao);
	    		No anterior = no.getAnterior();
	    		No proximo = no.getProximo();	    		
	    		anterior.setProximo(proximo);
	    		proximo.setAnterior(anterior);	    		
	    		this.totalDeElementos--;
    		}
    	}else{
    		System.out.println("Posi��o inv�lida!");
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
		
		System.out.println("In�cio: "+this.inicio.getElemento());
		System.out.println("Fim: "+this.fim.getElemento());
		return builder.toString();
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
	
	
}
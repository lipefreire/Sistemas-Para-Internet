	public void adicionaOrdenado(Pessoa item) {
		LinkedNode novoItem = new LinkedNode();
		novoItem.data = item;
		novoItem.proximo = null;
		novoItem.anterior = null;
		
		if (this.first == null) {
			this.first = novoItem;
			this.last = novoItem;
		} else {
			LinkedNode anterior = null;
			LinkedNode atual = first;
			while (atual != null && atual.data.getNome().compareTo(item.getNome()) <= 0) {
				anterior = atual;
				atual = atual.proximo;
			}
			if(atual != null) {
				novoItem.proximo = atual;
				atual.anterior = novoItem;
				novoItem.anterior = anterior;
				if (anterior != null) {
					anterior.proximo = novoItem;
				} else {
					this.first = novoItem;
				}
			} else {
				anterior.proximo = novoItem;
				novoItem.anterior = anterior;
				this.last = novoItem;
			}
		}
	}
	
	public void inverteLista() {
		LinkedNode atual = this.first;
		LinkedNode proximo = atual.proximo;
		this.last = atual;
		while(proximo != null) {
			atual.proximo = atual.anterior;
			atual.anterior = proximo;
			atual = proximo;
			proximo = proximo.proximo;
		}
		atual.proximo = atual.anterior;
		atual.anterior = proximo;
		this.first = atual;
	}

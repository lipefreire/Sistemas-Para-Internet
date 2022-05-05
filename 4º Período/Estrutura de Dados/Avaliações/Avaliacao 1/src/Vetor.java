
public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public String imprime() {
		String s = "[";
		for(int i = 0; i < this.tamanho -1; i++) {
			s += this.elementos[i] + ", ";
		}
		if(this.tamanho > 0) {
			s += this.elementos[this.tamanho-1];
		}
		s += "]";
		return s.toString();
	}
	
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho ++;
			return true;
			}
			return false;
	}
	public int tamanho() {
		return this.tamanho;
	}
			
	public int verificaPosicao(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public boolean adicionaPosicao(int posicao, String elemento) {
		if(!((posicao >= 0) && (posicao <= this.tamanho))) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	public void removerElemento(int posicao) {
		if(!(posicao >= 0) && (posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for(int i = posicao; i < tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
	}

	
	//1ª) QUESTÃO
	public void limparLista(){
		this.tamanho = 0;
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
	}
	
	//2ª) QUESTÃO
	public int procurarIndice(String elemento) {
		int indice = -1;
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				indice = i;
			}
		}
		return indice;
	}
	
	//3ª) QUESTÃO
	public void removerElemento(String elemento) {
		for(int i = this.tamanho -1; i >= 0; i--) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				this.removerElemento(i);
			}
		}
	}

	
}

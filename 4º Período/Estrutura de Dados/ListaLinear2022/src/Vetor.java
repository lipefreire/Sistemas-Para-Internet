import java.util.Arrays;

public class Vetor {
	//CRIANDO O ATRIBUTO ELEMENTOS - ELEMENTOS DO VETOR.
	private String[] elementos;
	private int tamanho;
	
	//CRIANDO O CONSTRUTOR
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*
	public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	
	*/
	
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
	
	//DESCOBRINDO QUANTOS ELEMENTOS POSSUI O VETOR (PERCORRENDO ELE).
	public int tamanho2() {
		int contador = 0;
		for(int i = 0; i < this.elementos.length; i++){
			if(this.elementos[i] != null) {
				contador++;
			}else {
				break;
			}
		}
		return contador;
	}
	
	//MOSTRANDO SOMENTE OS ELEMENTOS COM VALORES PREENCHIDOS (NÃO NULOS).
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
	
	//FORMA MELHORADA DO "IMRPIME" (UTILIZANDO O STRING BUILDER)
	public String imprimeMelhorado() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho -1; i++) {
			s.append(this.elementos[i] + ", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
	
	//BUSCANDO POSIÇÕES ESPECÍFICAS. 
	public String busca(int posicao) {
		if( (posicao >= 0) && (posicao < this.tamanho)){
			return this.elementos[posicao];
		}else {
			throw new IllegalArgumentException("Posição Inválida!");
		}
	}
	
	//BUSCANDO POSIÇÕES ESPECÍFICAS (FORMA MAIS SIMPLES UTILIZANDO O TRY CATCH.
	public String buscaTryCatch(int posicao) {
		try {
			return this.elementos[posicao];
		}catch (Exception e) {
			return "Posição Inválida!";
		}
	}
	
	public boolean verifica(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}
		return false;
	}
}

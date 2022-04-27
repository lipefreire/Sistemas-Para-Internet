import java.util.Arrays;

public class VetorObject {
		//CRIANDO O ATRIBUTO ELEMENTOS - ELEMENTOS DO VETOR.
		private Object[] elementos;
		private int tamanho;
		
		//CRIANDO O CONSTRUTOR
		public VetorObject(int capacidade) {
			this.elementos = new Object[capacidade];
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
		
		public boolean adiciona(Object elemento) {
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
		public Object busca(int posicao) {
			if( (posicao >= 0) && (posicao < this.tamanho)){
				return this.elementos[posicao];
			}else {
				throw new IllegalArgumentException("Posição Inválida!");
			}
		}
		
		//BUSCANDO POSIÇÕES ESPECÍFICAS (FORMA MAIS SIMPLES UTILIZANDO O TRY CATCH.
		public Object buscaTryCatch(int posicao) {
			try {
				return this.elementos[posicao];
			}catch (Exception e) {
				return "Posição Inválida!";
			}
		}
		
		public boolean verifica(Object elemento) {
			for(int i = 0; i < this.tamanho; i++) {
				if(this.elementos[i].equals(elemento)) {
					return true;
				}
			}
			return false;
		}
		
		//VERIFICAR POSIÇÃO DE UM ELEMENTO
		public int verificaPosicao(Object elemento) {
			for(int i = 0; i < this.tamanho; i++) {
				if(this.elementos[i].equals(elemento)) {
					return i;
				}
			}
			return -1;
		}
		
		public boolean adicionaPosicao(int posicao, Object elemento) {
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
		
		//AUMENTAR CAPACIDADE DO VETOR (INDICADO CRIAR UM NOVO COM O DOBRO DO TAMANHO)
		public void aumentaCapacidade() {
			if(this.tamanho == this.elementos.length) {
				Object[] elementosNovos = new Object[this.elementos.length * 2];
				for(int i = 0; i < this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		public void adicionaNovo(Object elemento) {
			if(this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				}else {
					this.aumentaCapacidade();
					this.elementos[this.tamanho] = elemento;
				}
			this.tamanho ++;
		}
		
		//REMOVER UM ELEMENTO EM DETERMINADA POSIÇÃO
		public void removerElemento(int posicao) {
			if(!(posicao >= 0) && (posicao < this.tamanho)) {
				throw new IllegalArgumentException("Posição Inválida!");
			}
			for(int i = posicao; i < tamanho - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
		}
		
		//REMOVENDO UM ELEMENTO A PARTIR DO SEU RESULTADO
		public void removeResultado(Object elemento) {
			int posicao = this.verificaPosicao(elemento);
			if(posicao > -1) {
				for(int i = posicao; i < tamanho-1; i++) {
					this.elementos[i] = this.elementos[i + 1];
				}
				this.tamanho--;
			}
		}

		@Override
		public String toString() {
			return "VetorObject [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
		}
		
		
		
	} 


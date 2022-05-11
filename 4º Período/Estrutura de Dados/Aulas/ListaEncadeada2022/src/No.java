
public class No {
	private No proximo;
	private Object elemento;
	
	public No(Object elemento, No proximo) {
		this.proximo = proximo;
		this.elemento = elemento;
	}
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	public No getElemento() {
		return elemento;
	}
	
	public void setElemento(No elemento) {
		this.elemento = elemento;
	}
	
	
}

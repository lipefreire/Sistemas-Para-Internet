public class App {

	public static void main(String[] args) {
		//1�) QUEST�O
		ListaEncadeada lista1 = new ListaEncadeada();
		
		//ADICIONANDO ELEMENTOS NA LISTA1
		lista1.adicionaNoFinal(9);
		lista1.adicionaNoFinal(5);
		lista1.adicionaNoFinal(2);
		lista1.adicionaNoFinal(8);
		lista1.adicionaNoFinal(15);
		System.out.println("Lista atual: " + lista1);
		//EXECUTANDO
		lista1.moveMenor();
		System.out.println("Lista ap�s mover o menor elemento: " + lista1 + "\n");
		
		//2�) QUEST�O
		ListaEncadeada lista2 = new ListaEncadeada();
		
		//ADICIONANDO ELEMENTOS NA LISTA 2.
		lista2.adicionaNoInicio(1);
		lista2.adicionaNoInicio(2);
		lista2.adicionaNoInicio(2);
		lista2.adicionaNoInicio(5);
		lista2.adicionaNoInicio(5);
		lista2.adicionaNoInicio(6);
		System.out.println(lista2);
		//EXECUTANDO
		lista2.removeRepetidos();
		System.out.println("Lista atualizada ap�s remo��o dos valores repetidos: " + lista2);
		
		//3�) QUEST�O
		ListaEncadeada lista3 = new ListaEncadeada();
		lista3.adicionaNoInicio(8);
		lista3.adicionaNoInicio(3);
		lista3.adicionaNoInicio(1);
		lista3.adicionaNoInicio(10);
		lista3.adicionaNoInicio(2);
		System.out.println(lista3);
		
		//EXECUTANDO
		//ESCOLHE DUAS POSI��ES QUE QUER INVERTER (A LISTA N�O PODE POSSUIR ELEMENTOS IGUAIS)
		
		System.out.println("Lista ap�s a troca de valores: " + lista3);
	}

}

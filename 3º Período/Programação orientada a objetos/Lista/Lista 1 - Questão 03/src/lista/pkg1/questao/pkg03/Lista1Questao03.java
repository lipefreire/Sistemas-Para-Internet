package lista.pkg1.questao.pkg03;

import java.util.Scanner;

public class Lista1Questao03 {


    public static void main(String[] args) {
        int valor = 0;
        
        Scanner adicionar = new Scanner(System.in);
        Contador valorCont = new Contador();
        
        System.out.print("| Contador |\n");
        System.out.println("Contador iniciado... | Total de itens: " + valor);
        
        valorCont.incrementar();
        System.out.println("\nValor atual do contador: " + valorCont.retornarValor() + "\n");
        
        System.out.print("O contador será Zerado...\n");
        valorCont.zerar();
        
        valorCont.retornarValor();
    }
}

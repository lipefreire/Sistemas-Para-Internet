package lista.pkg1.questao.pkg03;

import java.util.Scanner;

public class Contador {
    int valor = 0;
    double numero;
    
    Scanner adicionar = new Scanner(System.in);
    
    public void zerar (){
        valor = 0;
        System.out.print("Contador zerado com sucesso!\n");
        System.out.print("Valor atual do contador: " + valor + "itens\n");
        
    }
    
    public void incrementar (){
        System.out.print("Digite o valor que deseja incrementar ao contador: ");
        valor = valor + adicionar.nextInt();
        System.out.print("\nValor incrementado com sucesso.");
    }
    
    public double retornarValor(){
        return valor;
    }
}

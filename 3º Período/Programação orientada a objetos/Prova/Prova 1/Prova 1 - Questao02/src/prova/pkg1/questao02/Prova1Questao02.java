package prova.pkg1.questao02;

import java.util.Scanner;

public class Prova1Questao02 {

    static int valorN, valorM;
    static boolean retorno;
    
    public static void main(String[] args) {
        Matematica matematica1 = new Matematica();
        Scanner adicionar = new Scanner(System.in);
        
        System.out.println("Executando programa de Matemática...\n");
        System.out.print("Digite o valor de N: ");
        valorN = adicionar.nextInt();
        
        System.out.print("Digite o valor de M: ");
        valorM = adicionar.nextInt();
        
        retorno = matematica1.isMultiplo(valorN, valorM);
        
        System.out.println("\nVerificando se " + valorN + " é múltiplo de " + valorM + "...");
        System.out.println("Resultado: " + retorno);
        
    }
    
}

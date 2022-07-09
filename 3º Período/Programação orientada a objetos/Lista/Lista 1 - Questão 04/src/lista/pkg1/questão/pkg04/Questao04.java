package lista.pkg1.questão.pkg04;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Frase frase1 = new Frase();
        Scanner adicionar = new Scanner(System.in);
        
        System.out.println("Digite uma frase: ");
        String palin = adicionar.nextLine();
        
        frase1.nomear(palin);
        
        System.out.println(frase1.isPalindromo(palin));
        frase1.qtdPalavras(palin);
    }
    
}
